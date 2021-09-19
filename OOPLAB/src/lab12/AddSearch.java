/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
public class AddSearch {
    
    public  Employee register(){
      
      
      Employee emp= new Employee();
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter Employee ID: ");
      emp.id = scan.nextInt();
      scan.nextLine();
      System.out.print("Enter Name: ");
      emp.name = scan.nextLine();
      System.out.print("Enter Salary: ");
      emp.salary =scan.nextInt();
      return emp; 
    }
    
    public  void save(Employee employee) throws Exception{
        
        String filename = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name for save File: ");
        filename = sc.nextLine();
        
       
        PrintWriter wrtStudent = new PrintWriter(new FileWriter(filename,true));
        
        wrtStudent.print(employee.id+" ");
        wrtStudent.print(employee.name+" ");
        wrtStudent.println(employee.salary);
     
        wrtStudent.close();
        System.out.println("The file has been created");
    }
    
    public void search() throws FileNotFoundException, IOException{
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter file name in which you want to search :");
        String fileName=scan.next();
        System.out.println("ID of employee u want to search :");
        int id=scan.nextInt();
        
          if(!fileName.equals("")){
            File file = new File(fileName);
            FileReader fr=new FileReader(file);
            BufferedReader bf=new BufferedReader(fr);
              
              String line;
              String[] words;
              
              String ID=Integer.toString(id);
              
              while((line=bf.readLine())!=null){
              words=line.split(" ");
              for(String record:words){
                  if(record.equals(ID)){
                      System.out.println("Employee Record");
                      System.out.println(line);}
              }}
              
              
            
        }
        
        
       
   }

    }

