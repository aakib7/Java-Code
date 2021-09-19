/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LABTASK1;

/**
 *
 * @author aaqib
 */import java.util.*;
public class PermanentEmployee extends Employee {
    Scanner scan=new Scanner(System.in);
   
    double hourlyIncome;
    double income=0;

    public PermanentEmployee(double hourlyIncome, String name, int empId) {
        super(name, empId);
        this.hourlyIncome = hourlyIncome;
        
    }
    
     public void calculateMonthlyIncome(){
        income=hourlyIncome*180;
       
        
    }

    @Override
    public String toString() {
        
        return "Employee:"+name+"(ID"+empId+")\nThis month salary @500 PKR/Hour="+income;
    }
    
    

}
