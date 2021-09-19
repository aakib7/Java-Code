/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab8;

/**
 *
 * @author aaqib
 */
public class DoubleLinkList {
    private Node head;
    public int size=0;

    public DoubleLinkList() {
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    
    
    
    public void insertAtStart(Person date){
        Node n=new Node();
        n.setData(date);
       if(head==null){
       head=n;}
       else{
           n.setNext(head);
           head.setPrevious(n);
           head=n;
           n.setPrevious(null);
           size++;
       }
        
    }
    
    public void inserAtLast(Person date){
        Node temp;
        Node n=new Node();
        n.setData(date);
        temp=head;
        
        if(head==null){
        head=n;size++;}
        while(temp.getNext()!=null)
            temp=temp.getNext();
        
            temp.setNext(n);
            
            n.setPrevious(temp);
           
        
         size++;}
    
    public void insertAt(Person data,int nb){
        Node n=new Node();
        n.setData(data);
        Node temp;
        temp=head;
       
        for(int i=0;i<nb;i++){
            temp.getNext();
            n.setNext(temp);
            head.setPrevious(n.getPrevious());
            n.setPrevious(temp.getPrevious());
            head=n;
            
        }
        size++;
    }
    
    public void view(){
    Node temp;
    temp=head;
   while(temp!=null){
       
      
       System.out.println((temp.getData()).toString());
     temp=temp.getNext();
   }

        
    }

    
    
}
