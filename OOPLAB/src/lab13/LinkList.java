/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aaqib
 */
public class LinkList {
        Scanner scan=new Scanner(System.in);
        Random rand=new Random();

    public void task1(){
        LinkedList<Integer> list=new LinkedList<Integer>();
    
        for (int i = 0; i < 25; i++) {
            int random=rand.nextInt(100);
            list.add(random);}
                
        
            Collections.sort(list);
            System.out.println(list);
            System.out.println("Average="+findAverage(list));
    }
        public float findAverage(LinkedList<Integer> list){
            int sum=0;
            for (int i = 0; i < list.size(); i++) {
            sum=sum+list.get(i);}
            return sum/list.size();}
    

}
