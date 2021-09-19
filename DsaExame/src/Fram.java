
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */
public class Fram {
    private int Frame_No;
    private String[] FramData;
    String data;
    int max;
    int top;

    public Fram() {
    }
    
    

    public Fram(int Frame_No,String data) {
        this.Frame_No = Frame_No;
        this.data=data;
        this.max=10;
        this.top=-1;
        FramData=new String[max];
        push(data);
                

    }

    
    public int getFrame_No() {
        return Frame_No;
    }

    public String[] getFramData() {
        return FramData;
    }
    
    
    boolean isEmpty(){ 
        return (top < 0); 
    } 
    
    public void push(String data) {
        if(top>10){
            System.out.println("full stack");
        }
      FramData[++top]=data;
    }
    
    public String pop(){
         if(isEmpty()){
             System.out.println("stack is empty is no pop:");
             return null;
         }
         else{
         String e;
         e=FramData[top];
         top--;
         return e;}
         
     }
    @Override
    public String toString() {
        return Frame_No + " "+pop()+" ";
    }

}
            

