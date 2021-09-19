/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Tmplates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author aaqib
 */
import java.util.*;
public class AccountTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Account Number:");
        int acc=scan.nextInt();
        System.out.println("Enter Amount:");
        double am=scan.nextDouble();
        System.out.println("Enter name:");
        scan.nextLine();
        String name=scan.nextLine();
        
        Account account=new Account(acc,name,am);
        
        int choice=-1;
        
        do{
            manu();
        choice=scan.nextInt();
            switch(choice){
                
                case 1:{
                
                account.checkBalance();
                break;
                }
                case 2:{
                    System.out.println("\nEnter the ammount u wana to deposit:");
                   int a=scan.nextInt();
                account.deposite(a);
                break;
                }
                case 3:{
                    System.out.println("\nEnter amount u wana to with draw:");
                    int amu=scan.nextInt();
                account.withDraw(amu);
                break;}
                case 4:{
                account.display();
                break;}
                default:{
                    System.out.println("\nYou Enter wrong key try Again:");
                break;}
            
            }
            
        }while(choice!=0);
        
        
    }
    
    public static void manu(){
        System.out.println("*********************************");
        System.out.println("Enter 1 for Enter Check balance:");
        System.out.println("Enter 2 for Deposite:");
        System.out.println("Enter 3 for With Draw:");
        System.out.println("Enter 4 for All details:");
        System.out.println("Enter 0 for exit:");
        System.out.println("*********************************");
    }
    
}
