/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author aaqib
 */
import java.util.*;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        DoubleLinkList dl=new DoubleLinkList();
        
      System.out.println("Enter person name:");
        String n=scan.nextLine();
        System.out.println("Enter id:");
        int id=scan.nextInt();
        System.out.println("Enter age;");
        int age=scan.nextInt();
        
        Person p=new Person(id,age,n);
        Person p1=new Person(122,25,"ali");
        
        dl.insertAtStart(p);
        //dl.inserAtLast(p1);
        
        dl.insertAtStart(p);
       dl.insertAt(p1,2);
       
        dl.view();
    }
    
}
