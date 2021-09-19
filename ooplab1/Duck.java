/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab1;

/**
 *
 * @author aaqib
 */
public class Duck {
    public int no;
    public int eng=10;
    
    
    public void Walk(int no){
        System.out.println("\nDuck number:"+no);
        if(eng<=0){
            System.out.println("Duck cannot walk b/c low Energy level:");}
        else{
        eng-=2;
        System.out.println("Now Enerdy level of Duck id:"+eng);}
        
    }
    
    public void Swim(int no){
        System.out.println("\nDuck number:"+no);
        if(eng<=0){
            System.out.println("Duck cannot Swim b/c low Energy level:");}
        else{
        eng--;
        System.out.println("Now Enerdy level of Duck id:"+eng);}
    }
    
    public void Eat(){
    eng+=3;
        System.out.println("\nNow Enerdy level of Duck is again(+3):"+eng);
    }
    
    
    public static void main(String args[]){
    
        
        Duck d=new Duck();
        
        d.Swim(1);
         d.Swim(2);
          d.Swim(3);
           d.Swim(4);
            d.Swim(5);
             d.Swim(6);
             d.Walk(7);
             d.Walk(8);
             d.Swim(10);
             
        

        d.Eat();
    
    }
    
}
