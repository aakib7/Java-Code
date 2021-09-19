/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author aaqib
 */
public class PerorityQueue {
    
//    int max;
//    int[] pQueue;
//    int nItems;
//
//    public PerorityQueue() {
//    }
//    
//     public PerorityQueue(int num){
//         max=num;
//         pQueue=new int[max];
//    }
//     public boolean isEmpty(){
//     return nItems==0;}
//    
//     public void insert(int item){
//         
//         if(nItems==max){
//             System.out.println("Queue is full");
//         return;}
//        
//         else if(nItems==0){
//             pQueue[nItems]=item;
//             nItems++;
//        }
//         else{
//             int i;
//             for (i = nItems-1; i >= 0; i--) {
//                if(item>pQueue[i]){
//                    pQueue[i+1]=pQueue[i];  
//                }
//                 else{
//                 break;} 
//        }
//        pQueue[i+1]=item;
//         nItems++;
//         
//    }
    int max;
    String[] pQueue;
    int nItems;
    

        
     public PerorityQueue(int num){
         max=num;
         pQueue=new String[max];
    }
     public boolean isEmpty(){
     return nItems==0;}
    
     public void insert(DataItem item){
         
         if(nItems==max){
             System.out.println("Queue is full");
         return;}
        
//         else if(nItems==0){
//             pQueue[nItems]=item;
//             nItems++;
        //}
         else{
             int i;
             for (i = nItems-1; i >= 0; i--) {
                if(item.getName().length()>pQueue[i].length()){
                    pQueue[i+1]=pQueue[i];  
                }
                 else{
                 break;} 
        }
        pQueue[i+1]=item.getName();
         nItems++;
         
    }
        
         
}
     
     public String delete(){
        if(nItems==0){
            System.out.println("Empty Queue:");
        return "nnnnnnn";}
        else{
        return pQueue[--nItems];}
     }
       public void print(int[] a){
        for(int b:a){
            System.out.print(b+" ");}
    }
}

class main{
    public static void main(String[] args){
    
        DataItem[] ps=new DataItem[5];
       
         DataItem dt1=new DataItem("ali");
        DataItem dt2=new DataItem("aliali");
        DataItem dt3=new DataItem("aliasinm");
        DataItem dt4=new DataItem("alihamzauu");
        DataItem dt5=new DataItem("aliakramn");
        
        PerorityQueue pq=new PerorityQueue(5);
         pq.insert(dt1);
          pq.insert(dt2);
           pq.insert(dt3);
            pq.insert(dt4);
             pq.insert(dt5);
//       
////        pq.insert(30);
////        pq.insert(10);
////        pq.insert(40);
////        pq.insert(20);
////        pq.insert(50);
////        
//        pq.print(pq.pQueue);
//        System.out.println("");
//       while(!pq.isEmpty()){
//           System.out.println(pq.delete()+" ");
//       }
while(!pq.isEmpty()){
           System.out.println(pq.delete()+" ");
       }
        
        
    
    }
}
