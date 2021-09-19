/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11;

/**
 *
 * @author aaqib
 */
import java.util.Random;
public class Task11 {
    Random rand = new Random();
    int num1 = rand.nextInt(5);
    String []articles={"the","a","some","any","one"};
    String []noun={"boy","girl","dog","town","car"};
    String []preposition={"to","from","over","under","on"};
    String []verb={"drove","jumped","run","walk","sleep"};
    
    
    public void sentenceCreate(){
        
        for(int i=0;i<=20;i++){
        int num1 = rand.nextInt(5);
        int num2 = rand.nextInt(5);
        int num3 = rand.nextInt(5);
        int num4 = rand.nextInt(5);
        String word1=articles[num1];
        String word2=noun[num2];
        String word3=preposition[num3];
        String word4=verb[num4];
                                       
            System.out.println(word1+" "+word2+" "+word3+" "+word4);
        }
        
    }
    
    public void startWithB(){
       String[] check={"bello" ,"hello","Banana"};
        System.out.println("All Words");
       for(String a: check){
           System.out.print("->"+a);
       }
       
       int count=0;
       System.out.println("\nAll Words start with B");
       for(String a: check){
       if(a.charAt(0)=='b' || a.charAt(0)=='B'){
           count++;
           System.out.print("->"+a);
       }
       }
        System.out.println("\nTotal number of words start with B:"+count);
      
    }
   public void numberSplit(){
        String s="(555) 555-5555";
        String[] s1 = s.split("[\\(\\) -]");
         System.out.println("Before Split:"+s);
         System.out.print("After split:");
        for (String a: s1){
            System.out.print(a);}
        System.out.println();
    }
   
           
    }
  
