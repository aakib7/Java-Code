/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author aaqib
 */
public class Account {
    
    public int AccountNumber;
    private String name;
    public double balance;

    public Account(int AccountNumber, String name, double balance) {
        this.AccountNumber = AccountNumber;
        this.name = name;
        this.balance = balance;
        
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void checkBalance(){
        System.out.println("Yor Current Balance is:"+balance);
    }
    
    public void deposite(int amount){
        if(amount<0){
            System.out.println("Invallid Amount:");}
        else {
        
       balance+=amount;
       System.out.println("\n your remaining balance is: "+balance);
        }
    }
    
    public void withDraw(int amount){
    if(amount>balance){
        System.out.println("Incificient Balance:");}
    else{
    balance -=amount;
        }}
    
    public void display(){
        System.out.println("{" + "AccountNumber=" + AccountNumber + ", name=" + name + ", balance=" + balance + '}');
    }

   

    
    
    
    
}
