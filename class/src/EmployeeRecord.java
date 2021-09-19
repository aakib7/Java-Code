
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public interface EmployeeRecord {
    
    public void addEmployee(Employee emp,Address ad) throws SQLException;
    public void searchEmployee(int id) throws SQLException ;
    public void getAllEmployee()throws SQLException;
    public void deleteEmployee(int id)throws SQLException;
    public void updateEmployee(int id)throws SQLException;
    
            
}
