/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

import java.io.IOException;

/**
 *
 * @author aaqib
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)  {
        // TODO code application logic here
         
        System.out.println("TASK-1");
         try{
             throw new ExceptionC();
         }
         catch(ExceptionA excep){
             System.out.println("Frist exception");}
    try{
             throw new ExceptionB();
         }
         catch(ExceptionB excep1){
             System.out.println("Scend exception");}
    
        System.out.println("\nTASK-2");
    try{
             throw new ExceptionA();
         }
         catch(Exception excep){
             System.out.println(excep.getMessage());}
    
    try{
             throw new NullPointerException();
         }
         catch(Exception excep){
             System.out.println(excep.toString());}

    
    try{
             throw new IOException();
         }
         catch(Exception excep){
             System.out.println(excep.toString());}

    
     System.out.println("\nTASK-3");
    try{
             throw new ExceptionA();
         }
     
    catch(ExceptionB excep){  
     System.out.println(excep.getMessage());}
    
     catch(Exception excep){
             System.out.println(excep.getMessage());}  
//     catch(ExceptionB excep){  ->error already catch
//             System.out.println(excep.getMessage());}
//    
        System.out.println("Task-4");
        try{
            
            SomeClass sm=new SomeClass();
        }
        catch(Exception x){
            System.out.println("Constractor Exception");}

         
        System.out.println("Task-5");
        try{
            
           someMethod();
        }
        catch(Exception x){
            System.out.println(x.getMessage());
           //x.printStackTrace();
        }
    }
public static void someMethod()throws Exception{
    try{
    someMethod2();}catch(Exception e){
    throw e;}
}

public static void someMethod2()throws Exception{
    throw new Exception("Some Method 2 Exception");
}
}
    

