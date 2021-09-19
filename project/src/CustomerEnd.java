

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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

    public CustomerEnd() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMS", "root","sp19bse087caajame");
        statement=connection.createStatement();
    }
    
    public void customerAccountVarificaton(int account) throws SQLException{
        double r=0;
        double e=0;
        int p=0;
        statement = connection.createStatement();
        resultSet = statement.executeQuery("SELECT * FROM customer Where accountNumber="+account);

            while (resultSet.next()) {
                System.out.print("Account Number:");
                System.out.println(resultSet.getInt("accountNumber") );
                System.out.print("Name:");
                System.out.println(resultSet.getString("name"));
                System.out.print("Amount:");
                r=resultSet.getDouble("amount");
                System.out.println(r);
                p=resultSet.getInt("password");
                System.out.println();
            }
           
            System.out.println("Enter 1)for add Amount:");
            System.out.println("Enter 2)for With draw Amount:");
            int t=scan.nextInt();
            if(t==1){
            
            System.out.println("Enter your Password:");
            int password=scan.nextInt();
            
                if(p==password){
                 System.out.println("Enter the Amount you wand to add:");
        double amount=scan.nextDouble();
        if(amount<0){
            System.out.println("Invaild:");}
        else {
            
            e=r+amount;
            System.out.println("YOUR NEW AMOUNT:"+e);
            
      String query = "update customer set amount = ? where  accountNumber = ?";
      PreparedStatement preparedStmt = connection.prepareStatement(query);
      preparedStmt.setDouble(1, e);
      preparedStmt.setInt(2,account);
     
      preparedStmt.executeUpdate();
}}
                else{
                    System.out.println("YOY ENTER WRONG PASSWORD:");}
               
            }
            else if(t==2){
        System.out.println("Enter your Password:");
         int password=scan.nextInt();
        if(p==password){
        
        System.out.println("Enter the Amount you wand to With Draw:");
        double amount=scan.nextDouble();
        
        if(amount>r){
            System.out.println("Insufficient Balance:");}
        else if(amount<0){
            System.out.println("Invalid:");}
        else{
            
        e=r-amount;
        
      System.out.println("YOUR NEW AMOUNT:"+e); 
    
      String query = "update customer set amount = ? where  accountNumber = ?";
      PreparedStatement preparedStmt = connection.prepareStatement(query);
      preparedStmt.setDouble(1, e);
      preparedStmt.setInt(2,account);
     
      preparedStmt.executeUpdate();
        }
         }
        
        else{
            
            System.out.println("YOY ENTER WRONG PASSWORD:");
        }
          }
            }
              }

       
                
         