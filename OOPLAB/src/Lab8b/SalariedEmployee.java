/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8b;

/**
 *
 * @author aaqib
 */
public class SalariedEmployee extends Employee{
    
    private double weeklySalary;

    public SalariedEmployee(double weeklySalary, String frisrName, String lastName, String SSN, Date DOB) {
        super(frisrName, lastName, SSN, DOB);
        this.weeklySalary = weeklySalary;
    }

    

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        if (weeklySalary < 0.0){
           throw new IllegalArgumentException("Weekly salary should be >= 0.0");}
        this.weeklySalary = weeklySalary;
    }
    
    @Override
    public double earnings(){
      return getWeeklySalary();
   }

    @Override
    public String toString() {
        return "SalariedEmployee{" + "weeklySalary=" + weeklySalary + '}'+super.toString();
    }
    
}
