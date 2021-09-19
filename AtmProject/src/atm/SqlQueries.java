/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aaqib
 */
public class SqlQueries {
    
    private Connection connection=null;
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
      
    
    public void databaseConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","sp19bse087caajame");
        statement=connection.createStatement();
        
    
    }
    
    
    public boolean checkRecord (int cardNumber) throws SQLException{
        boolean flag=false;
    String query="select * from card where card_no="+cardNumber;
    resultSet=statement.executeQuery(query);
    boolean t=resultSet.isBeforeFirst();
    if(t){
        flag=true;}
    return flag;
    
    }
    
    
    public String getName(int cardNumber) throws SQLException{
        String userName=null;
        String userName1=null;
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select f_name,l_name from user where user_id=(select user_id from "
        + "usercard where card_no="+cardNumber+")");

         while (resultSet.next()) {
                
            userName=resultSet.getString("f_name");
            userName1=resultSet.getString("l_name");}
        return userName+" "+userName1;
    }
    
    public int getPin(int card) throws SQLException{
        int pin=0;
    
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select pin from usercard where card_no="+card);
        while (resultSet.next()) {    
            pin=resultSet.getInt("pin");}
        return pin;}
    
    public float getCurrentBalance(int card) throws SQLException{
        float amount=0;
    
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select user_amount from usersaccount where user_id=(select user_id from "
        + "usercard where card_no="+card+")");

        while (resultSet.next()) {    
            amount=resultSet.getFloat("user_amount");}
        return amount;}
    
    public String getAccountNumber(int card) throws SQLException{
        String accountNumber=null;
    
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select uc.account_number from usersaccount uc,usercard c where c.user_id=uc.user_id "
                + "and c.card_no="+card);

        while (resultSet.next()) {    
            accountNumber=resultSet.getString("account_number");}
        return accountNumber;}
    
    public int getUserId(int card) throws SQLException{
        
        int id=0;
        
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select user_id from usercard where card_no="+card);
        while (resultSet.next()) {    
        id=resultSet.getInt("user_id");}
        
        return id;
    }
     public void updateAmount(int card,float a) throws SQLException{
        float amount=getCurrentBalance(card);
        float x=amount-a;
        
      statement = connection.createStatement();
      String sql = "UPDATE usersaccount SET user_amount="+x+" WHERE user_id=(select user_id from usercard where card_no="+card+")";
      statement.executeUpdate(sql);
    
    }
    
  
    public float withdrawAmount(int card,float am) throws SQLException, ParseException{
       //validation done in main file
        
//        float amount=getCurrentBalance(card);
      int id=getUserId(card);
      
     int transection_no=getMaxTransectionNo()+1; 
     String sql = "INSERT INTO transection_record(user_id,amount,transection_date,transection_id,transection_no,machine_id)"+ 
       "VALUES ("+id+","+am+",CURRENT_DATE,101,"+transection_no+",11)";
     statement.executeUpdate(sql);
      updateAmount(card,am);
    return am;
    
    }
    
    
    public float billPayent(int card,float am) throws SQLException{
    int id=getUserId(card);
    
     int transection_no=getMaxTransectionNo()+1; 
     String sql = "INSERT INTO transection_record(user_id,amount,transection_date,transection_id,transection_no,machine_id)"+ 
       "VALUES ("+id+","+am+",CURRENT_DATE,103,"+transection_no+",11)";
     statement.executeUpdate(sql);
    
     updateAmount(card,am);
    return am;
    }
    
    public boolean checkAccountNumber(String accountNumber) throws SQLException{
        boolean bool=false;
        
        
        String query="select * from usersaccount where account_number="+accountNumber;
        resultSet=statement.executeQuery(query);
        boolean t=resultSet.isBeforeFirst();
    if(t){
        bool=true;}
    return bool;
    }
    
    public void transfer(int card,String accountNumber,float am) throws SQLException{
        
        //get amount through account number update
        float amount=0;
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select user_amount from usersaccount where account_number="+accountNumber);

        while (resultSet.next()) {    
        amount=resultSet.getFloat("user_amount");}
       
        amount=amount+am;
      
       String sql = "UPDATE usersaccount SET user_amount="+amount+" WHERE account_number="+accountNumber;
       statement.executeUpdate(sql);
       
     //update sender account  
     
       updateAmount(card,am);
      
       int id=getUserId(card);
       int transection_no=getMaxTransectionNo()+1;
      
       String sql1 = "INSERT INTO transection_record(user_id,amount,transection_date,transection_id,transection_no,machine_id)"+ 
                   "VALUES ("+id+","+am+",CURRENT_DATE,102,"+transection_no+",11)";
     statement.executeUpdate(sql1);   
    }
    
    public int getMaxTransectionNo() throws SQLException{
        int id=0;
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select max(transection_no) from transection_record");

         while (resultSet.next()) {
            id=resultSet.getInt("max(transection_no)");
            }
    return id;
    }    
    
}
