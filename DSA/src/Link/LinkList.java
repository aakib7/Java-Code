
package Link;

public class LinkList {
    
    Node head;
    int size=0;
    
     public boolean isEmpty()
     {
     if(head==null)
         return true;
     else
         return false;
     }
     
    public void insertAtStart(int data)
    {
        Node n=new Node();
        n.setData(data);
        n.setNext(head);
        head=n;
        size++;
      
    }
    
    public void insertAtlast(int val)
    {
    Node n=new Node();
    Node t;
    n.setData(val);
    t=head;
            if(t==null)
            { head=n;size++;}
            else{
            while(t.getNext()!=null)
            
           t=t.getNext();
           t.setNext(n);
           size++;
            }
            
    }
    
    
    
    public void inserAtPos(int data,int val)
    {
    Node n=new Node(),t;
    n.setData(data);
    t=head;
    for(int i=0;i<val-1;i++)
   
   t=t.getNext();
    n.setNext(t.getNext());
    t.setNext(n);
    size++;
    }
    public void dltAtlast()
    {
    Node t;
    t=head;
   for(int i=0;i<size-1;i++)
   {
   t=t.getNext();}
   t.setNext(null);
   
    size--;
    }
    
    public void listView()
    {
    Node t;
    if(isEmpty())
            System.out.println("list is empty");
    else{
       t=head;
    for(int i=0;i<size;i++){
            System.out.println(" "+t.getData());
              t= t.getNext();}}
      //  Node t;
//        t=head;
//        while(t!=null)
//        {System.out.println(t.getData());
//        t=t.getNext();
//        }
 
    }
}



    
    

