/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.PriorityQueue;

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
        
        System.out.println("Task-1");
        LinkList task=new LinkList();
        task.task1();
        System.out.println(" ");
        
        
        System.out.println("Task-2");
        PriorityQueue<Student> queue=new  PriorityQueue<>(); 
        queue.offer(new Student("aaqib", 110,3.45));
        queue.offer(new Student("ali", 114,3.38));
        queue.offer(new Student("hassan", 113,3.29));
        queue.offer(new Student("hamza", 112,3.1));
        queue.offer(new Student("hanzla", 190,3.0));
        
         for (int i = 1; i <= 5; i++) {
            System.out.println(queue.remove());}
    }
    
}
