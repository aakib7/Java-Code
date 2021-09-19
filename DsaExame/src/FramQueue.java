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
public class FramQueue {
    
    public Fram[] FramQueue;
    private int rear;
    private int front;
    private int max;
    private int currentSize;
    
    public FramQueue(int num){
        max=num;
        FramQueue= new Fram[max];
        rear=-1;
        front=-1;
        currentSize=0;
    }
    
    public boolean isFull(){
    return currentSize==max;}
 
    public boolean isEmpty(){
    return currentSize==0;}
    
    public void enQueue(Fram data) {
        
    if(isFull()){ 
        System.out.println("Queue if full!");
    }
    else if(front==-1 && rear==-1){
        front=0;
        rear=0;
        FramQueue[rear]=data;
        rear=(rear+1)%max;
        currentSize++;
    }
     
    else{
        FramQueue[rear]=data;
        rear=(rear+1)%max;
        currentSize++;
    }}
    
    public Fram deQueue() {
    if(isEmpty()){
        System.out.println("Queue is Empty!");
    return null;}
    
    
    else{
    Fram temp=FramQueue[front];
    FramQueue[front]=null;
    front=(front+1)%max;
    currentSize --;
    return temp;
    }}

    @Override
    public String toString() {
        return "Fram Queue:"+Arrays.toString(FramQueue);
    }
       
}
