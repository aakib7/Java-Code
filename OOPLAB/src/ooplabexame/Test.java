/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplabexame;

import java.util.Scanner;

/**
 *
 * @author aaqib
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);

        House house=new House();
        Apartment ap=new Apartment();
        house.setHouseMaintenenceBill(1500);
        ap.setApartmentMaintenenceBill(2000);
        int choice=0;
        boolean exit=true;
        while(exit){
            System.out.println("1 For house\n2For apartment\n3For exit:");
            choice=scan.nextInt();
            switch(choice){
                case 1:{
                    Building house1=new House();
                    System.out.println("for save 1 for search 2 for bill 3");
                    int ch=scan.nextInt();
                    if(ch==1){
                    System.out.println("Enter number of house to store record");
                    int num=scan.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Record of Building "+(i+1));
                        house.saveInformation(house.input());
                    }}
                    else if(ch==2){
                    System.out.println("Enter house number for search:");
                    scan.nextLine();
                    String search=scan.nextLine();
                    house.searchInformation(search);}
                    else if(ch==3){
                    System.out.println("Enter month for See Total Bill");
                    int month=scan.nextInt();
                    System.out.println(house.calculateTotleBill(month));}
                break;}
                case 2:{
                    System.out.println("for save 1 for search 2 for bill 3");
                    int ch=scan.nextInt();
                    scan.nextLine();
                     if(ch==1){
                    System.out.println("Enter number of Apartment to store record");
                    int num=scan.nextInt();
                    for (int i = 0; i < num; i++) {
                        System.out.println("Record of Building"+(i+1));
                        ap.saveInformation(ap.input());
                    }}
                     else if(ch==2){
                    System.out.println("Enter apartment number for search:");
                    scan.nextLine();
                    String search=scan.nextLine();
                    ap.searchInformation(search);}
                     else if(ch==3){
                    System.out.println("Enter month for See Total Bill");
                    int month=scan.nextInt();
                    System.out.println(ap.calculateTotleBill(month));}
                    break;}
                case 3:{
                exit=false;
                break;}
                default:{
                    System.out.println("Wrong key!!!");
                break;}}
        
        }
        
    }
    
}

