/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Customer extends Information{

    
    private int accountNumber;
    private double amount;
    private int password;

    public Customer() {
    }

    
    public Customer(int accountNumber, double amount, String name, String phone, Address address, String gender, boolean status,int password) {
        super(name, phone, address, gender, status);
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.password=password;
    }

    

   
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

  
  
    
}
