/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
import java.util.*;
import java.sql.*;
public class Test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        EmployeeServices employee=new EmployeeServices();
        CustomerService  customer=new CustomerService();
        CustomerEnd customerEnd=new CustomerEnd();
        Customer cu=new Customer();
        int choice,choice2,choice3=0;
        int choice5=0;
        
        do{menu1();
        choice=scan.nextInt();
        System.out.println("****************************************\n");
        switch(choice){
        
            case 1:{
                              scan.nextLine();
                System.out.println("Enter User name:");
                int uName=scan.nextInt();
                System.out.println("Enter password:");
                int pass=scan.nextInt();
                if(uName==123 && pass==124){
                    
                   do{
                
                menu2();
                 choice2=scan.nextInt();
                 System.out.println("****************************************\n");
                switch(choice2){
                    case 1:{
                        menu3();
                         choice3=scan.nextInt();
                   System.out.println("****************************************\n");
                        
                        switch(choice3){
                       
                            case 1:{
        Employee emp=new Employee();
        scan.nextLine();
        System.out.println("Enter the Details of Employee:");
        System.out.println("Enter Name:");
        String name=scan.nextLine();
        System.out.println("Enter Gender:");
        String gender=scan.nextLine();
        System.out.println("Enter phone:");
        String phone=scan.nextLine();
        System.out.println("Enter post:");
        String post=scan.nextLine();
        System.out.println("Enter Status(true or false)");
        boolean status=scan.nextBoolean();
        System.out.println("Enter 1)for parmanent 2)for hourly:");
        int type=scan.nextInt();
        int hr=0;
        double hrlySalary=0;
        if(type==1){
            emp.setType(1);
        }
        else if(type==2){
            System.out.println("Enter hour of your work:");
            hr=scan.nextInt();
            System.out.println("Eter Hourly Salary:");
            hrlySalary=scan.nextDouble();
            emp.setType(2);
           
        }
        System.out.println("Enter Salary:");
        double salary=scan.nextDouble();
        System.out.println("Enter Id");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Complete Address: ");
        String z = scan.nextLine();
        System.out.println("Enter country:");
        String country=scan.nextLine();
        System.out.println("Enter province:");
        String pro=scan.nextLine();
        Address addres=new Address(z,country,pro);
        Employee e=new Employee(post,salary,type,hr,hrlySalary,name,phone,addres,gender,status,id);
                                employee.addEmployee(e, addres);
                            break;
                            }
                            case 2:{
                                System.out.println("Enter Id of Employee you want to Search:");
                            int uid=scan.nextInt();
                            employee.searchEmployee(uid);
                                break;}
                            case 3:{
                                employee.getAllEmployee();
                                break;
                            }
                            case 4:{
                            System.out.println("Enter Id of Employee you want to Delete:");
                            int del=scan.nextInt();
                            employee.deleteEmployee(del);
                                break;
                            }
                            case 5:{
                            System.out.println("Enter Id of Employee you want to Update::");
                            int up=scan.nextInt();
                            employee.updateEmployee(up);
                            break;
                            }
                       
                        } 
                      
                        break;
                    }
                    case 2:{
                    do{menu4();
                    int choice4=scan.nextInt();
                      System.out.println("*****************************************\n");
                    switch(choice4){
                        case 1:{
        System.out.println("Enter Name:");
        String name=scan.nextLine();
        System.out.println("Enter Gender:");
        String gender=scan.nextLine();
        System.out.println("Enter Password:");
        int password=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Status(true or false)");
        boolean status=scan.nextBoolean();
        System.out.println("Enter phone:");
        String phone=scan.nextLine();
        System.out.println("Enter Accout Number:");
        int account=scan.nextInt();
        System.out.println("Enter Ammount:");
        double ammount=scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Complete Address: ");
        String z = scan.nextLine();
        System.out.println("Enter country:");
        String country=scan.nextLine();
        System.out.println("Enter province:");
        String pro=scan.nextLine();
        Address addres=new Address(z,country,pro);
       
        Customer cust=new Customer(account,ammount,name,phone,addres,gender,status,password);
                        customer.addCustomer(cust, addres);
                        break;    
                        }
                        case 2:{
                        System.out.println("Enter Account Nember of Customer you want Search::");
                        int search=scan.nextInt();
                        customer.searchCustomer(search);
                        break;
                        }
                        case 3:{
                        customer.getAllCustomer();
                        break;
                        }
                        case 4:{
                            System.out.println("Enter Account Nember of Customer you want Delete::");
                            int delete=scan.nextInt();
                        customer.deleteCustomer(delete);
                        break;
                        }
                        case 5:{
                            System.out.println("Enter Account Nember of Customer you want to Update::");
                            int aNumber=scan.nextInt();
                        customer.updateCustomer(aNumber);
                        break;}
                        
                    }}while(choice3!=0);
                    break;
                    }
                
                }}
            
                while(choice2 !=0);
                
                }
                    
                
                 
                else{
                    System.out.println("You Enter Wrong password TRY AGAIN:");
                }
               
                break;
           
            }
            case 2:{
                System.out.println("   *****   Customer END   *****\n   ");
                System.out.println("Enter your Account Number:");
                int account=scan.nextInt();
                customerEnd.customerAccountVarificaton(account);

                break;
            }
            
        }}while(choice!=0);
    }
    public static void menu1(){
        System.out.println("   *****   MAIN   *****\n   ");
        System.out.println("Enter 1)for Manager End:\nEnter 2)for Customer End:\nEnter 0)for Exit:\n");
        
       
    }
    public static void menu2(){
        System.out.println("   *****   MANGER END   *****\n   ");
        System.out.println("Enter 1)for Employee:\nEnter 2)for Customer:\nEnter 0)for Main:\n");
        
    
    }
    public static void menu3(){
        System.out.println("Enter 1)for add new Employee:");
        System.out.println("Enter 2)for Search Employee:");
        System.out.println("Enter 3)for Get All Employee:");
        System.out.println("Enter 4)for Delete:");
        System.out.println("Enter 5)for Update Employee:\nEnter 0)for MANGER END:\n");
      
    }
    public static void menu4(){
        System.out.println("Enter 1)for add new Customer:");
        System.out.println("Enter 2)for Search Customer:");
        System.out.println("Enter 3)for Get All Customer:");
        System.out.println("Enter 4)for Delete:");
        System.out.println("Enter 5)for Update Customer:\nEnter 0)for MANGER END:\n"); 
       
    }
}
