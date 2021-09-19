


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
        EmployeeService employee=new EmployeeService();
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
        System.out.println("Enter 1)for Employee details:\nEnter 2)for Customer details:\nEnter 0)for Main:\n");
        
    
    }
    public static void menu3(){
        System.out.println("Enter 1)for add new Employee:");
        System.out.println("Enter 2)for Search Employee:");
        System.out.println("Enter 3)for Get All Employee:");
        System.out.println("Enter 4)for Delete:");
        System.out.println("Enter 0)for MANGER END:\n");
      
    }
    public static void menu4(){
        System.out.println("Enter 1)for add new Customer:");
        System.out.println("Enter 2)for Search Customer:");
        System.out.println("Enter 3)for Get All Customer:");
        System.out.println("Enter 4)for Delete:");
        System.out.println("Enter 0)for MANGER END:\n"); 
       
    }
}















///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author aaqib
// */
//import java.util.*;
//import java.sql.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.geometry.Pos;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.canvas.Canvas;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.VBox;
//import javafx.scene.paint.Color;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//public class Test  extends Application{
//
//    /**
//     * @param args the command line arguments
//     */
//    
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        launch(args);
//        // TODO code application logic here
//    }
//  
//    public static void menu2(){
//        System.out.println("   *****   MANGER END   *****\n   ");
//        System.out.println("Enter 1)for Employee:\nEnter 2)for Customer:\nEnter 0) for exit:\n");
//        
//    
//    }
//    public static void menu3(){
//        System.out.println("Enter 1)for add new Employee:");
//        System.out.println("Enter 2)for Search Employee:");
//        System.out.println("Enter 3)for Get All Employee:");
//        System.out.println("Enter 4)for Delete:");
//        System.out.println("\nEnter 0)for MANGER END:\n");
//      
//    }
//    public static void menu4(){
//        System.out.println("Enter 1)for add new Customer:");
//        System.out.println("Enter 2)for Search Customer:");
//        System.out.println("Enter 3)for Get All Customer:");
//        System.out.println("Enter 4)for Delete:");
//        System.out.println("Enter 0)for MANGER END:\n"); 
//       
//    }
//  
//    public static void customer() throws SQLException, ClassNotFoundException{      
//  System.out.println("   *****   Customer END   *****\n   ");
//                System.out.println("Enter your Account Number:");
//                Scanner scan=new Scanner(System.in);
//                int account=scan.nextInt();
//                CustomerEnd customerEnd=new CustomerEnd();
//                customerEnd.customerAccountVarificaton(account);}
//    
//    
//    public static void Manager(){
//     
//        try {     
//            Scanner scan=new Scanner(System.in);
//            EmployeeService employee = new EmployeeService();;
//            
//            CustomerService  customer=new CustomerService();
//            CustomerEnd customerEnd=new CustomerEnd();
//            Customer cu=new Customer();
//            int choice,choice2,choice3=0;
//            int choice5=0;       
//            do{            
//            menu2();
//            choice2=scan.nextInt();
//            System.out.println("****************************************\n");
//            switch(choice2){
//            case 1:{
//            menu3();
//            choice3=scan.nextInt();
//            System.out.println("****************************************\n"); 
//            switch(choice3){
//                                    
//            case 1:{
//              Employee emp=new Employee();
//              scan.nextLine();
//              System.out.println("Enter the Details of Employee:");
//              System.out.println("Enter Name:");
//              String name=scan.nextLine();
//              System.out.println("Enter Gender:");
//              String gender=scan.nextLine();
//              System.out.println("Enter phone:");
//              String phone=scan.nextLine();
//              System.out.println("Enter post:");
//              String post=scan.nextLine();
//                System.out.println("Enter Status(true or false)");
//                boolean status=scan.nextBoolean();
//                System.out.println("Enter 1)for parmanent 2)for hourly:");
//                int type=scan.nextInt();
//                int hr=0;
//                double hrlySalary=0;
//                if(type==1){
//                    emp.setType(1);
//                }
//                else if(type==2){
//                    System.out.println("Enter hour of your work:");
//                    hr=scan.nextInt();
//                    System.out.println("Eter Hourly Salary:");
//                    hrlySalary=scan.nextDouble();
//                    emp.setType(2);
//
//                }
//                System.out.println("Enter Salary:");
//                double salary=scan.nextDouble();
//                System.out.println("Enter Id");
//                int id=scan.nextInt();
//                scan.nextLine();
//                System.out.println("Enter Complete Address: ");
//                String z = scan.nextLine();
//                System.out.println("Enter country:");
//                String country=scan.nextLine();
//                System.out.println("Enter province:");
//                String pro=scan.nextLine();
//                Address addres=new Address(z,country,pro);
//                Employee e=new Employee(post,salary,type,hr,hrlySalary,name,phone,addres,gender,status,id);
//                employee.addEmployee(e,addres);
//                break;
//            }
//            case 2:{
//                System.out.println("Enter Id of Employee you want to Search:");
//                int uid=scan.nextInt();
//                employee.searchEmployee(uid);
//                break;}
//            case 3:{
//                employee.getAllEmployee();
//                break;
//            }
//            case 4:{
//                System.out.println("Enter Id of Employee you want to Delete:");
//                int del=scan.nextInt();
//                employee.deleteEmployee(del);
//                break;
//            }
//           
//
//        }
//
//        break;
//    }
//    case 2:{
//        do{menu4();
//        int choice4=scan.nextInt();
//        System.out.println("*****************************************\n");
//        switch(choice4){
//            case 1:{
//                scan.nextLine();
//                System.out.println("Enter Name:");
//                String name=scan.nextLine();
//                System.out.println("Enter Gender:");
//                String gender=scan.nextLine();
//                System.out.println("Enter Password:");
//                int password=scan.nextInt();
//                scan.nextLine();
//                System.out.println("Enter Status(true or false)");
//                boolean status=scan.nextBoolean();
//                scan.nextLine();
//                System.out.println("Enter phone:");
//                String phone=scan.nextLine();
//                System.out.println("Enter Accout Number:");
//                int account=scan.nextInt();
//                System.out.println("Enter Ammount:");
//                double ammount=scan.nextDouble();
//                scan.nextLine();
//                System.out.println("Enter Complete Address: ");
//                String z = scan.nextLine();
//                System.out.println("Enter country:");
//                String country=scan.nextLine();
//                System.out.println("Enter province:");
//                String pro=scan.nextLine();
//                Address addres=new Address(z,country,pro);
//
//                Customer cust=new Customer(account,ammount,name,phone,addres,gender,status,password);
//                customer.addCustomer(cust, addres);
//                break;
//            }
//            case 2:{
//                System.out.println("Enter Account Nember of Customer you want Search::");
//                int search=scan.nextInt();
//                customer.searchCustomer(search);
//                break;
//            }
//            case 3:{
//                customer.getAllCustomer();
//                break;
//            }
//            case 4:{
//                System.out.println("Enter Account Nember of Customer you want Delete::");
//                int delete=scan.nextInt();
//                customer.deleteCustomer(delete);
//                break;
//            }
//            
//
//                }}while(choice3!=0);
//                break;
//                }
//
//                }}
//
//                while(choice2 !=0);    
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//        }  
//    
//} 
//    
//Scene scene1, scene2,scene3;
//    @Override    
//    public void start(Stage primaryStage) throws Exception {   
//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(20);
//        grid.setVgap(20);
//        Text formHeadingTxt = new Text("Enter Login Information");
//        formHeadingTxt.setFont(Font.font("Roboto", FontWeight.NORMAL, 40));
//        grid.add(formHeadingTxt, 0, 0, 2, 1);
//        Button Btn = new Button("Manager");        
//        grid.add(Btn, 0, 1);
//        Button Btn2 = new Button("Costumer");
//        grid.add(Btn2, 4, 1);
//        Btn.setOnAction(e -> primaryStage.setScene(scene2));
//        Btn2.setOnAction(e -> primaryStage.setScene(scene3));
//        HBox hBox = new HBox();
//        hBox.setAlignment(Pos.TOP_LEFT);
//        hBox.getChildren().addAll(Btn,Btn2);
//        grid.add(hBox, 0, 3, 2, 1);
//        Scene scene = new Scene(grid, 500, 375);
//        
//        
//        
//        GridPane g2 = new GridPane();
//        g2.setAlignment(Pos.CENTER);
//        g2.setHgap(20);
//        g2.setVgap(20);
//        Text formHeadingTxt2 = new Text("----Welcome Manager---");
//        formHeadingTxt2.setFont(Font.font("Roboto", FontWeight.NORMAL, 40));
//        g2.add(formHeadingTxt2, 0, 0, 2, 1);
//        Label l1= new Label("UserName");
//        g2.add(l1, 0, 1);
//        TextField textField = new TextField();
//        g2.add(textField, 1, 1);
//        Label passwordLabel = new Label("Password:");
//        g2.add(passwordLabel, 0, 2);
//        PasswordField passwordField = new PasswordField();
//        passwordField .setOnAction(new EventHandler<ActionEvent>() {
//        @Override public void handle(ActionEvent e) {
//        if (! passwordField .getText().equals("12345")) {
//        System.out.println("wrong pass");
//        } else {        
//            System.out.println("Correct");
//            Manager();
//        }
//        passwordField .clear();
//        }
//        });
//          
//        
//        g2.add(passwordField, 1, 2);
//        Button button2= new Button("Back");
//        g2.add(button2, 2, 2);
//        button2.setOnAction(e -> primaryStage.setScene(scene));
//        VBox layout2= new VBox(20);
//        layout2.getChildren().addAll(g2);
//        scene2= new Scene(layout2,1000,500);
//  
//       
//        GridPane g3 = new GridPane();
//        g3.setAlignment(Pos.CENTER);
//        g3.setHgap(20);
//        g3.setVgap(20);
//        Text formHeadingTxt3 = new Text("----Welcome Costumer---");
//        formHeadingTxt3.setFont(Font.font("Roboto", FontWeight.NORMAL, 40));
//        g3.add(formHeadingTxt3, 0, 0, 2, 1);
//        Label l3= new Label("UserName");
//        g3.add(l3, 0, 1);
//        TextField textField3 = new TextField();
//        g3.add(textField3, 1, 1);
//        Label passwordLabel3 = new Label("Password:");
//        g3.add(passwordLabel3, 0, 2);
//        PasswordField passwordField3 = new PasswordField();
//        g3.add(passwordField3, 1, 2);
//
//        passwordField3 .setOnAction(new EventHandler<ActionEvent>() {
//        @Override public void handle(ActionEvent e) {
//        if (! passwordField3 .getText().equals("1234")) {
//        System.out.println("wrong pass");
//        } else {
//         
//        System.out.println("Correct");            
//        try {
//        customer();
//            } catch (SQLException ex) {
//                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//        passwordField3 .clear();
//    }
//         });         
//        Button button3= new Button("Back");
//        g3.add(button3, 2, 2);
//        button3.setOnAction(e -> primaryStage.setScene(scene));
//        VBox layout3= new VBox(20);
//        layout3.getChildren().addAll(g3);
//        scene3= new Scene(layout3,1000,500);
//                           
//        
//        primaryStage.setScene(scene);
//        primaryStage.show();
//        
//        
//    }
//}

