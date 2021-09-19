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
public class CommissionEmployee extends Employee{
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(double grossSale, double commissionRate, String frisrName, String lastName, String SSN, Date DOB) {
        super(frisrName, lastName, SSN, DOB);
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

      
    
    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSale();
     } 

    @Override
    public String toString() {
        return "CommissionEmployee{" + "grossSale=" + grossSale + ", commissionRate=" + commissionRate + '}'+super.toString();
    }
    
   
    
}
