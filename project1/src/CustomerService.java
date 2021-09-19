
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class CustomerService {
    private   Connection connection=null;
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    
    public CustomerService() throws  SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMS", "root","sp19bse087caajame");
        statement=connection.createStatement();
        
    }
    
    

    public void addCustomer(Customer cus,Address ad)throws SQLException{
      String a= ad.toString();
       preparedStatement = connection.prepareStatement("INSERT INTO customer(accountNumber,name, gender,status,amount,phone,address,password) VALUES(?,?, ?, ?, ?,?,?,?)");
       
       preparedStatement.setInt(1,cus.getAccountNumber());
       preparedStatement.setString(2, cus.getName());
       preparedStatement.setString(3, cus.getGender());
       preparedStatement.setBoolean(4, cus.isStatus());
       preparedStatement.setDouble(5,cus.getAmount());
       preparedStatement.setString(6, cus.getPhone());
       preparedStatement.setString(7,a);
       preparedStatement.setInt(8,cus.getPassword());
       preparedStatement.executeUpdate();
       
    }
    
   
    public void searchCustomer(int aNumber)throws SQLException{
        
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM customer Where accountNumber="+aNumber);

            while (resultSet.next()) {
                System.out.print("ACCOUNT NUMBER:");
                System.out.println(resultSet.getInt("accountNumber") );
                System.out.print("AMOUNT:");
                System.out.println(resultSet.getDouble("amount"));
                System.out.print("NAME:");
                System.out.println(resultSet.getString("name"));    
                System.out.print("GENDER:");
                System.out.println(resultSet.getString("gender"));
                System.out.print("PHONE:");
                System.out.println(resultSet.getString("phone"));
                System.out.print("STATUS:");
                System.out.println(resultSet.getBoolean("status"));
                System.out.print("ADDRESS:");
                System.out.println(resultSet.getString("address"));
                System.out.println();
            }
    }

    
    public void getAllCustomer()throws SQLException{
    resultSet = statement.executeQuery("SELECT * FROM customer");
    
    while (resultSet.next()) {
        
                System.out.print("ACCOUNT NUMBER:");
                System.out.println(resultSet.getInt("accountNumber") );
                System.out.print("AMOUNT:");
                System.out.println(resultSet.getDouble("amount"));
                System.out.print("NAME:");
                System.out.println(resultSet.getString("name"));    
                System.out.print("GENDER:");
                System.out.println(resultSet.getString("gender"));
                System.out.print("PHONE:");
                System.out.println(resultSet.getString("phone"));
                System.out.print("STATUS:");
                System.out.println(resultSet.getBoolean("status"));
                System.out.print("ADDRESS:");
                System.out.println(resultSet.getString("address"));
                System.out.println();
             
            }
    
    
    }
    
    
    
    public void deleteCustomer(int account)throws SQLException{
        statement = connection.createStatement();
            int num = statement.executeUpdate("DELETE FROM customer WHERE accountNumber="+account);
            System.out.println(num + " Rows updated. ");
    }
   
  
    
    
}


