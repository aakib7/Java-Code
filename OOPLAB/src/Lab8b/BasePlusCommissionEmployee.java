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
public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    private double baseSalary; 

    public BasePlusCommissionEmployee(double baseSalary, double grossSale, double commissionRate, String frisrName, String lastName, String SSN, Date DOB) {
        super(grossSale, commissionRate, frisrName, lastName, SSN, DOB);
        this.baseSalary = baseSalary;
    }
    
  
  public void setBaseSalary( double salary ) {
       if (baseSalary < 0.0){
           throw new IllegalArgumentException("Base salary should be >= 0.0");}
       this.baseSalary = salary;
     } 
     public double getBaseSalary() {
        return baseSalary;
     } 
    @Override
     public double earnings() {
       return getBaseSalary() + super.earnings();
     } 

    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" + "baseSalary=" + baseSalary + '}'+super.toString();
    }
      
    
}
