/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaqib
 */package ComplexNumber;
public class ComplexNumberArrays {
   
    
    Complex[] fristOperands=new Complex[2];
    Complex[] secondOperands =new Complex[3];
    String Operand[];
    Complex n;
    Complex a[];
    
    
    
    //int[] fristOperands=new int[]{11,2};
//public void insertAtStart(int a){
//        int s[]=new int[fristOperands.length+1];
//        for(int i=0;i<=fristOperands.length;i++){
//            if(i==0){
//                s[0]=a;
//            }
//            else{
//            s[i]=fristOperands[i-1];}
//        }
//        //System.out.println(s[0]);
//        for(int i=0;i<s.length;i++){
//            System.out.println(s[i]);}
//    }
   
   
   
    public Complex[] insertAtStart(Complex a){
        Complex s[]=new Complex[fristOperands.length+1];
        for(int i=0;i<=fristOperands.length;i++){
            if(i==0){
                s[0]=a;
            }
            else{
            s[i]=fristOperands[i-1];}
        }
        return s;
    }
    
    public Complex[] insertAtEnd(Complex x){
      
        Complex a[]=new Complex[fristOperands.length+1];
        
        for(int i=0;i<=fristOperands.length;i++){
          
            if (i !=a.length){
            a[i]=secondOperands[i];}
            
            else if (i==a.length){
                a[a.length]=x;
            }
        }
        return a;
    }
    
    public Complex []insertAtindex(Complex y,int index){
        Complex[] s=new Complex[fristOperands.length+1];
        
        for(int i=0;i<fristOperands.length;i++){
            if(i==index){
                s[i]=y;
            }
            else{
            s[i]=fristOperands[i];}
        }
        return s;
    }
    
    public Complex[] DeleteAtEnd(Complex [] z){
        
        Complex [] newArray=new Complex[z.length-1];
        
        for(int i=0;i<=z.length;i++){
            
            if(i==z.length){
                
            z[z.length]=n;
            }
            
            else{
        newArray[i-1]=z[i];}}
        return newArray;
    }
    
    public Complex[] DeleteAtStart(Complex[] q){
       
        Complex [] newArray1=new Complex[q.length-1];
        
        for(int i=0;i<=q.length;i++){
        if(i==0){
            q[0]=n;
        }
        else{
            newArray1[i-1]=q[i];}
        
        }
        return newArray1;
    }
   
}
