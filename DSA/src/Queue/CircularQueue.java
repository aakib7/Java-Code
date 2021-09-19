/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Arrays;

/**
 *
 * @author aaqib
 */
public class CircularQueue <E> {
    private E[] circularQueue;
    private int rear;
    private int front;
    private int max;
    private int currentSize;
    
    public CircularQueue(int num){
        max=num;
        circularQueue=(E[]) new Object[max];
        rear=-1;
        front=-1;
        currentSize=0;
    }
    
    public boolean isFull(){
    return currentSize==max;}
 
    public boolean isEmpty(){
    return currentSize==0;}
    
    public void enQueue(E item) throws QueueFullException{
        
    if(isFull()){ 
        throw new QueueFullException("Queue if full!");
    }
    else if(front==-1 && rear==-1){
        front=0;
        rear=0;
        circularQueue[rear]=item;
        rear=(rear+1)%max;
        currentSize++;
    }
     
    else{
        circularQueue[rear]=item;
        rear=(rear+1)%max;
        currentSize++;
    }}
    
    public E deQueue() throws QueueEmptyException{
    if(isEmpty()){
     throw new QueueEmptyException("Queue is Empty!");
    
    }
    else{
    E temp=circularQueue[front];
    circularQueue[front]=null;
    front=(front+1)%max;
    currentSize --;
    return temp;
    }}

    @Override
    public String toString() {
        return "CircularQueue:"+Arrays.toString(circularQueue);
    }
}

class Test{
    public static void main(String[] args) throws QueueEmptyException {
    
    CircularQueue <Integer> cq=new CircularQueue<Integer>(5);
    try{
    cq.enQueue(1);
    cq.enQueue(2);
    cq.enQueue(3);
    cq.enQueue(4);
    cq.enQueue(5);
   
    System.out.println(cq.toString());
    System.out.println("After de queue:");
    cq.deQueue();
    System.out.println(cq.toString());
    cq.enQueue(115);
    System.out.println("After enqueue:");
    System.out.println(cq.toString());
    System.out.println("After de queue:");
    cq.deQueue();
    System.out.println(cq.toString());

     CircularQueue <String> cq1=new CircularQueue<String>(2);
    cq1.enQueue("AAQIB");
    cq1.enQueue("JAVED");
   
    System.out.println(cq1.toString());
    

    }
    catch(QueueEmptyException| QueueFullException  e){
        System.out.println(e.getMessage());
    }
    
}
}
 


