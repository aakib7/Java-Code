/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author aaqib
 */
import java.util.*;
public class ArraysTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        
        StringArrays s=new StringArrays();
        
        System.out.println("Enter nb. of subjects:");
        int x=scan.nextInt();
             scan.nextLine();
        StringArrays s1=new StringArrays(x);
        //s1.concatinate();
        
        
    }
    
}
