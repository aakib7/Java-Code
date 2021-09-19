//aaqib javed 
package Queue;

// Linear Queue

public class Queue {

    
    private int QAray[];
    private int rear;
    private int front;
    private int max;
    private int nItem;
    
    public Queue(int size){
    max=size;
    QAray=new int[max];
    rear=-1;
    front=-1;
    nItem=0;
    }

   public boolean isEmpty(){
   boolean bool;
   if(front<0||front>rear){
   bool=true;}
   else{
   bool=false;}
   return bool;
   }
   
   public boolean isFull(){
       boolean bool;
       if(rear>=max-1){
           bool=true;
       }
       else{
       bool=false;}
       return bool;
   }
   
    public void enQueue(int num){
        if(isFull()){
            System.out.println("Queue is full!");}
        else if(rear<0 && front<0){
            front++;
            QAray[++rear]=num;
            nItem++;
        }
        else{
            QAray[++rear]=num;
            nItem++;
        }
    }
    
    public int deQueue(){
    if(isEmpty()){
        System.out.println("Queue is empty!");
        return -9999;
    }
    else{
        int temp=QAray[front++];//temp=qaray[front];front++;
        nItem--;
        return temp;
    }
    
  }
    public int size(){
    return nItem;}
    
    public void print(int[] a){
        for(int b:a){
            System.out.print(b+" ");}
    }
}

 class QueueTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue qu=new Queue(5);
        //qu.deQueue();
        qu.enQueue(10);
        qu.enQueue(11);
        qu.enQueue(12);
        qu.enQueue(13);
        qu.enQueue(14);
       
        
        while(!qu.isEmpty()){
            System.out.println(qu.deQueue());}
        
        qu.deQueue();
        
        
         }
    
}