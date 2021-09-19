/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.IOException;
import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
        Scanner scan = new Scanner(System.in);
        AddSearch as=new AddSearch();
        int choice=0,choice1=0;
        boolean iterater=true,iterater1=true;
       
        while(iterater1){
            
        System.out.println("1-for TASK-1\n2-for Task-2\n3-for Exit");
        choice=scan.nextInt();
        switch(choice){
            case 1:{
                ReverseContent rc=new ReverseContent();
                rc.reverse();
                break;}
            default:
                System.out.println("You enter a Wrong key:");
            case 2:{
                while(iterater){
                    System.out.println("1-for add data-1\n2-for search data\n3-for exit");
                    choice1=scan.nextInt();
                switch(choice1){
                    case 1:{
                        as.save(as.register());
                        break;}
                    case 2:{
                        as.search();
                        break;}
                    case 3:{
                        iterater=false;}
                    default:
                        System.out.println("You enter a wrong key:");
                }
              }

            }
        }  
    }
}}
