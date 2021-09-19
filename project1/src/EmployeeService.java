
import java.sql.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author aaqib
 */
public class EmployeeService implements EmployeeRecord  {

    private   Connection connection=null;
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    
    
    public EmployeeService() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/EMS", "root","sp19bse087caajame");
        statement=connection.createStatement();
        
    }
    
    
    @Override
    public void addEmployee(Employee emp ,Address ad)throws SQLException{
       double a=emp.calculateSalary();
       String b=ad.toString();
       preparedStatement = connection.prepareStatement("INSERT INTO employee(id,name, gender, phone, status,salary,post,hour,hourSalary,type,address)" + " VALUES(?,?, ?, ?, ?,?,?,?,?,?,?)");
       
       preparedStatement.setInt(1,emp.getId());
       preparedStatement.setString(2, emp.getName());
       preparedStatement.setString(3, emp.getGender());
       preparedStatement.setString(4, emp.getPhone());
       preparedStatement.setBoolean(5, emp.isStatus());
       preparedStatement.setDouble(6,a);
       preparedStatement.setString(7,emp.getPost());
       preparedStatement.setInt(8,emp.getHour());
       preparedStatement.setDouble(9,emp.getHoursalary());
       preparedStatement.setInt(10,emp.getType());
       preparedStatement.setString(11,b);
       
       preparedStatement.executeUpdate();
       
    }
    
    
    @Override
    public void searchEmployee(int uId)throws SQLException{
        
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM employee Where id="+uId);

            while (resultSet.next()) {
                System.out.print("ID:");
                System.out.println(resultSet.getInt("id") );
                System.out.print("NAME:");
                System.out.println(resultSet.getString("name"));  
                System.out.print("GENDER:");
                System.out.println(resultSet.getString("gender"));
                System.out.print("PHONE:");
                System.out.println(resultSet.getString("phone"));
                System.out.print("TYPE:");
                System.out.println(resultSet.getInt("type"));
                System.out.print("SALARY:");
                System.out.println(resultSet.getDouble("salary"));
                System.out.print("STATUS:");
                System.out.println(resultSet.getBoolean("status"));
                System.out.print("ADDRESS:");
                System.out.println(resultSet.getString("address"));
                System.out.println();
            }
    }

   
    @Override
    public void getAllEmployee()throws SQLException{
    resultSet = statement.executeQuery("SELECT * FROM employee");
    
    while (resultSet.next()) {
                System.out.print("ID:");
                System.out.println(resultSet.getInt("id") );
                System.out.print("NAME:");
                System.out.println(resultSet.getString("name"));  
                System.out.print("GENDER:");
                System.out.println(resultSet.getString("gender"));
                System.out.print("PHONE:");
                System.out.println(resultSet.getString("phone"));
                System.out.print("TYPE:");
                System.out.println(resultSet.getInt("type"));
                System.out.print("SALARY:");
                System.out.println(resultSet.getDouble("salary"));
                System.out.print("STATUS:");
                System.out.println(resultSet.getBoolean("status"));
                System.out.print("ADDRESS:");
                System.out.println(resultSet.getString("address"));
                System.out.println();
            }
    
    
    }
    
    
    
    @Override
    public void deleteEmployee(int uid)throws SQLException{
        statement = connection.createStatement();
            int num = statement.executeUpdate("DELETE FROM employee WHERE id="+uid);
            System.out.println(num + " Rows updated. ");
    }
    
    
    
    
}
