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
public class Employee {
    
     String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    
    
    @Override
    public String toString() {
        return "Employee:"+name+"(ID"+empId+")";
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        
        while(true){
            System.out.println("\n1 for permanent employee:\n2 for hourly employee:\n3 for exit:");
            int ch=scan.nextInt();
            switch(ch){
                case 1:{
                    scan.nextLine();
                    System.out.println("Enter Name");
                    String name=scan.nextLine();
                    System.out.println("Enter Id");
                    int id=scan.nextInt();
                    System.out.println("Enter hourly income");
                    double income=scan.nextDouble();
        
        if(income<=0){
            System.out.println("Error!!");
            System.exit(0);
                    }
                    
                    
                 PermanentEmployee ps=new PermanentEmployee(income,name,id);
                 ps.calculateMonthlyIncome();
                 System.out.println( ps.toString());
                 
                 break;
                 }
                case 2:{
                    scan.nextLine();
                    System.out.println("Enter Name");
                    String name=scan.nextLine();
                    System.out.println("Enter Id");
                    int id=scan.nextInt();
                    System.out.println("Enter hourly income");
                    double income=scan.nextDouble();
             
        if(income<=0){
            System.out.println("Error!!");
            System.exit(0);
                    }
                    
                    
                 HourlyEmployee hm=new HourlyEmployee(income,name,id); 
                 hm.calculateMonthlyIncome();
                    System.out.println( hm.toString());
                 
                 break;
                 }
                
            }
        }
        
        
        
        
    }
    
    
}
