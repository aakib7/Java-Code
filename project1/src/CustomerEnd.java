

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime; 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
import java.util.*;
public class CustomerEnd {
    Scanner scan=new Scanner(System.in);
    private   Connection connection=null;
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
      double r=0;
        double e=0;
        int p=0;
        double amount=0;int aN;
        int t=-1;

    public CustomerEnd() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMS", "root","sp19bse087caajame");
        statement=connection.createStatement();
        
        
    }
    
    public void customerAccountVarificaton(int account) throws SQLException{
      
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM customer Where accountNumber="+account);

            while (resultSet.next()) {
                System.out.print("Account Number:");
                aN=resultSet.getInt("accountNumber");
                System.out.println(resultSet.getInt("accountNumber") );
                System.out.print("Name:");
                System.out.println(resultSet.getString("name"));
                System.out.print("Amount:");
                r=resultSet.getDouble("amount");
                System.out.println(r);
                p=resultSet.getInt("password");
                System.out.println();
            }
            
            
           do{
               
                      System.out.println("\nEnter 1)for add Amount:");
                      System.out.println("Enter 2)for With draw Amount:");
                      System.out.println("Enter 3)for Transection history:");
                      System.out.println("Enter 0)for Back:\n");
                      t=scan.nextInt();
            
            switch(t){
            case 1:{
            
            
            System.out.println("Enter your PIN:");
            int password=scan.nextInt();
            
                if(p==password){
                                     System.out.println("Enter the Amount you wand to add:");
                                     amount=scan.nextDouble();
        
        if(amount<0){
                      
                                    System.out.println("Invaild:");
        }
        else {
            
            e=r+amount;
            System.out.println("YOUR NEW AMOUNT:"+e);  
      String query = "update customer set amount = ? where  accountNumber = ?";
      PreparedStatement preparedStmt = connection.prepareStatement(query);
      preparedStmt.setDouble(1, e);
      preparedStmt.setInt(2,account);
      preparedStmt.executeUpdate();
      isertDransectionHistory(account,"Deposite");
     
}}
                else{
                    System.out.println("YOu ENTER WRONG PASSWORD or Account Number:\n");
                }
               break;
            }
            case 2:{
           
        System.out.println("Enter your PIN:\n");
         int password=scan.nextInt();
        if(p==password){
        
        System.out.println("Enter the Amount you wand to With Draw:\n");
        amount=scan.nextDouble();
        
        if(amount>r){
            System.out.println("Insufficient Balance:\n");
        System.exit(0);}
        else if(amount<0){
            System.out.println("Invalid:\n");
        System.exit(0);}
        else{
            
        e=r-amount;
        
      System.out.println("YOUR NEW AMOUNT:"+e); 
    
      String query = "update customer set amount = ? where  accountNumber = ?";
      PreparedStatement preparedStmt = connection.prepareStatement(query);
      preparedStmt.setDouble(1, e);
      preparedStmt.setInt(2,account);
     
      preparedStmt.executeUpdate();
      isertDransectionHistory(account,"Withdraw");
      System.exit(0);
        }
         }
        
        else{
            
            System.out.println("YOY ENTER WRONG PASSWORD OR ACCOUNT:");
            System.exit(0);
        }
        break;
         }
            case 3:{
            
                System.out.println("Enetr Pin:\n");
                int pin=scan.nextInt();
                if(pin!=p){
                    System.out.println("Wrong Pin or account number::");
                System.exit(0);}
                else{
                readDransectionHistory(account);}
                break;
            }}}while(t!=0);
                
    
    }         
            
            
    public void isertDransectionHistory(int ac,String s) throws SQLException{
    
     preparedStatement = connection.prepareStatement("INSERT INTO customerRecord(status,amount,timedate,accountNumber)" + " VALUES(?,?,?,?)");
      preparedStatement.setString(1,s);
       preparedStatement.setDouble(2,amount);
       String tt=time();
       preparedStatement.setString(3,tt);
       preparedStatement.setInt(4,ac);
       
        preparedStatement.executeUpdate();
        
    }
    
    public void readDransectionHistory(int acc) throws SQLException{
        
      
        statement = connection.createStatement();
      resultSet = statement.executeQuery("SELECT * FROM customerRecord Where accountNumber="+acc);
      System.out.println("Amount:\t\t\tStatus:\t\t\t\tDate and Time:\n");
      while (resultSet.next()) {
                
                System.out.print(resultSet.getInt("amount") );
                System.out.print("\t\t\t");
                System.out.print(resultSet.getString("status"));
                System.out.print("\t\t\t");
                System.out.print(resultSet.getString("timedate"));
                System.out.println();
                
            }
      
    }
    
    
    public String time(){
        
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
             String time=dtf.format(now);
             return time;
    }
              }     