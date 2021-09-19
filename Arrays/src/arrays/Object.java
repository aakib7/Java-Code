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
public class Object {
    
    public Object(int nb,String name){
        
        System.out.println("Name:"+name+"Number:"+nb);
    
    }

    
    
      public static void main(String args[]){
      
          Object [] ob={new Object(123,"Ali"),new Object(432,"Ahmed")};
          
          for(Object a : ob){
            System.out.println(a);}
      }
   
    
}
 