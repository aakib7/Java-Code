/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab1;

/**
 *
 * @author aaqib
 */
import java.util.*;
public class OopLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Task 1:");
        System.out.println("Hello World:\n");
        
        System.out.println("Task 2:");
        
        System.out.println("Enter Integer:");
        int integer=scan.nextInt();
        System.out.println("Integer u entered: "+integer);
        
        System.out.println("Task 3:");
        
        for (int i=0;i<=9;i++){
            System.out.println("Enter:"+i);
            int x=scan.nextInt();
            System.out.println(x);
        }
        
        System.out.println("Task 4:");
        
        System.out.println("\nFor Grater amoung five numbers:");
       
            System.out.println("Enter integers 1:");
            int n=scan.nextInt();
            System.out.println("Enter integers 2:");
            int n1=scan.nextInt();
            System.out.println("Enter integers 3:");
            int n2=scan.nextInt();
            System.out.println("Enter integers 4:");
            int n3=scan.nextInt();
            System.out.println("Enter integers 5:");
            int n4=scan.nextInt();
       
            if(n>n1&&n>n2&&n>n3&&n>n4){
            System.out.println("Grater intereg:"+n);}
            
            else if(n1>n && n1>n2 &&n1>n3&&n1>n4){
            System.out.println("Grater intereg:"+n1);}
            
            else if(n2>n1&& n2>n &&n2>n3 && n2>n4){
            System.out.println("Grater intereg:"+n2);}
            
            else if(n3>n1&&n3>n2&&n3>n1&&n3>n4){
            System.out.println("Grater intereg:"+n3);}
            
            else if(n4>n1&&n4>n2&&n4>n3&&n4>n){
            System.out.println("Grater intereg:"+n4);}
   
    }
    
}
