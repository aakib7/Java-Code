/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList;

import java.util.NoSuchElementException;

/**
 *
 * @author aaqib
 */
public class LinlList {
    private Node frist;
    private Node last;
    
    public boolean isEmpty(){
    return frist==null;}
    
    public void addLast(int item){
    Node node=new Node();
    node.setValue(item);//Node node =new Node(item);>
    if(isEmpty()){
//    frist=node;
//    last=node;
    frist=last=node;
    }
    else{
    last.setNext(node);
    last=node;}
    }
    
    public void addFrist(int item){
    Node node=new Node(item);
    
    if(isEmpty()){
    frist=last=node;}
    else{
    node.setNext(frist);
    frist=node;
    }}
    
    public int findIndex(int item){
    int index=0;
    Node temp=frist;
    while(temp!=null){
        if(temp.getValue()==item)return index;
    temp=temp.getNext();
    index++;}
    return -1;
    }
    
    public boolean contain(int item){
    return findIndex(item)!=-1;}
    
    public void removeFrist(){
        
        if(isEmpty()){
        throw new NoSuchElementException();
        }
        
        if(frist==last){
        frist=last=null;
        return;}
        
    Node temp;
    temp=frist.getNext();
    frist.setNext(null);
    temp=frist;
    }
    
    public void removeLast(){
        if(isEmpty()){
        throw new NoSuchElementException();
        }
        
        if(frist==last){
        frist=last=null;
        return;}
        
        Node privious=getPrivious(last);
        privious=last;
        last.setNext(null);
        
        
    }
    
    private Node getPrivious(Node node){
    Node temp;
    temp=frist.getNext();
    while(temp!=null){
    if(temp.getNext()==node)return temp;
    temp=temp.getNext();}
    return null;
    }
    
    
    public void print(){
    Node temp;
    temp=frist.getNext();
    temp=frist;
    while(temp!=null){
        System.out.println(temp.getValue());
        temp=temp.getNext();
    }}
}
