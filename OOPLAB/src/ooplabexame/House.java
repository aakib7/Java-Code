/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplabexame;

/**
 *
 * @author aaqib
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class House extends Building{
    
    private double houseMaintenenceBill;
    

    public House(double houseMaintenenceBill, String houseNumber, boolean iaPaid, int billingMonth, String resName, String houseType) {
        super(houseNumber, iaPaid, billingMonth, resName, houseType);
        this.houseMaintenenceBill = houseMaintenenceBill;
    }

    public House() {
        
    }
    

    
    public double getHouseMaintenenceBill() {
        return houseMaintenenceBill;
    }

    public void setHouseMaintenenceBill(double houseMaintenenceBill) {
        this.houseMaintenenceBill = houseMaintenenceBill;
    }
    
    @Override
    public Building input(){
    
    Scanner scan=new Scanner(System.in);
    
        System.out.println("Enter house number:");
        String houseNumber=scan.nextLine();
        System.out.println("Enter Resident name:");
        String resName=scan.nextLine();
        System.out.println("billing Month:");
        int month=scan.nextInt();
        if(month<1&&month>12){
            System.out.println("Invalid");
        System.exit(0);}
        scan.nextLine();
        System.out.println("paid Status");
        boolean status=scan.nextBoolean();
        System.out.println("Enter house type");
        String houseType=scan.next();
        Building b=new Building(houseNumber,status,month,resName,houseType);
        return  b;
    }
    
    @Override
    public void saveInformation(Building b){
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        System.out.println("Enter file name:"); 
        String filename = scan.nextLine();
                
        PrintWriter wrtStudent=null;
        try {
            wrtStudent = new PrintWriter(new FileWriter(filename,true));
        } catch (IOException ex) {
            Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        wrtStudent.print(b.getHouseNumber()+" ");
        wrtStudent.print(b.resName+" ");
        wrtStudent.print(b.getBillingMonth()+" ");
        wrtStudent.print(b.isIaPaid()+" ");
        wrtStudent.println(b.houseType);
        wrtStudent.close();
        System.out.println("The file has been created");

    }    
    
    @Override
    public void searchInformation(String houseNumber){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter file name in which you want to search :");
        String fileName=scan.next();
        
        if(!fileName.equals("")){
              File file = new File(fileName);
              FileReader fr=null;
            try {
                fr = new FileReader(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
            }
              BufferedReader bf=new BufferedReader(fr);
              
              String line;
              String[] words;
                
            try {
                while((line=bf.readLine())!=null){
                    words=line.split(" ");
                    for(String record:words){
                        if(record.equals(houseNumber)){
                            System.out.println("House Record:");
                            System.out.println(line);}
                    }}
            } catch (IOException ex) {
                Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    
    } 
    
     @Override
    public double calculateTotleBill(int month){
        Building b=new Building();
        double monthCount=0;
        int f=0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter file name in which you want to search :");
        String fileName=scan.next();
                
          if(!fileName.equals("")){
              File file = new File(fileName);
              FileReader fr = null;
            try {
                fr = new FileReader(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
            }
              BufferedReader bf=new BufferedReader(fr);
              
              String line;
              String[] words;
              
              String month1=Integer.toString(month);
              String a=Boolean.toString(b.isIaPaid());
              
            try {
                while((line=bf.readLine())!=null){
                    words=line.split(" ");
                    for(String record:words){
                        if(record.equals(month1)){
                        monthCount++;
                              }
//                        else if(a=="false"){
//                        f++;}
                    }}
            } catch (IOException ex) {
                Logger.getLogger(House.class.getName()).log(Level.SEVERE, null, ex);
            }
              
              
            
        }
         
     double totalbill=getHouseMaintenenceBill()*monthCount;
    return totalbill;}

    
}
