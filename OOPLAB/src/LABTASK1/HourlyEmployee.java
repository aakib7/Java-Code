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
public class HourlyEmployee extends Employee{
    double hourlyIncome;
    int hours;
    double income=0;
 Scanner scan=new Scanner(System.in);
    public HourlyEmployee(double hourlyIncome,  String name, int empId) {
        super(name, empId);
        this.hourlyIncome = hourlyIncome;
        
       System.out.println("Enter hours:");
        hours=scan.nextInt();
        if(hours<=0){
            System.out.println("Error!!");
        System.exit(0);}
    }
    
    public void calculateMonthlyIncome(){
         income=hourlyIncome*hours;
       
        
    }
    @Override
    public String toString() {
        
        return "Employee:"+name+"(ID"+empId+")\nThis month salary @500 PKR/Hour="+income;
    }
    

}
