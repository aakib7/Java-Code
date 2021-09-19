/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.project;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java. util. LinkedList;
import java.util.*;
/**
 *
 * @author malik Abdul Rehman
 */
public class Check {
     
   Scanner scan=new Scanner(System.in);
   Node file[]=new Node[20];
   public String filenames[]=new String[10];


    public void achievingfile(String filenames[]){

        filenames[0] = "D1.txt";
        filenames[1] = "D2.txt";
        filenames[2] = "D3.txt";
        filenames[3] = "D4.txt";
        filenames[4] = "D5.txt";
        filenames[5] = "D6.txt";
        filenames[6] = "D7.txt";
        filenames[7] = "D8.txt";
        filenames[8] = "D9.txt";
        filenames[9] = "D10.txt";
    }



    public void printingtroughlinkedlist(){
        int k = 0;
        while(k <= 9){
            
        System.out.println("\n"+(k+1)+"------------next file---------");    
        int i = 1;
        Node current=new Node();
        current = file[k];
        while (current != null)
        {
            System.out.print(current.getWord()+" ");
            current=current.getLink();
            i++;}
        k++;}
    }


    public void deletenode(){
        int i = 0;
    while(i < 10){
        Node point = file[i];
        int j = 0;
    while (j < 10){
        point = point.getLink();
        j++;}
        Node cur = point.getLink();
        point.setLink(null);
    while (cur != null){
        Node p = cur;
        cur = cur.getLink();
        point.removeLastNode(cur);}
        i++;
        }}



    public boolean stop(String word) throws FileNotFoundException {

        File file = new File("New Stop.txt");
            Scanner input = new Scanner(file); 


            while (input.hasNext()) {
              String tword  = input.next();
              if(word.equalsIgnoreCase(tword))
               {
                    return true;} 
                }

        return false;
        }


        public void insertioninlinkedlist() throws FileNotFoundException, IOException
        {

        int l = 10;
        for(int k = 0 ; k < 10 ; k++)
        {
         boolean x = false;
                        File filee = new File(filenames[k]);
            Scanner input = new Scanner(filee); 
            while (input.hasNext()) {
              String tword  = input.next();
        if(stop(tword)==false)

        {
        if (file[k] != null)
        {
        Node point = file[k];
        while (point != null)
        {
        if (point.getWord().equalsIgnoreCase(tword))
        {
        int count = point.getOccur();
            count++;
        point.setOccur(count);

        x = true;
        break;
        }
        point = point.getLink();
        }
        }
        if (x == false)
        {
        Node temp = new Node();
        temp.setWord(tword) ;
        temp.setOccur(1);
        temp.setLink(null);
        if (file[k]== null)
        {
        file[k] = temp;
        file[l] = temp;
        }
        else
        {
        file[l].setLink(temp);
        file[l] = temp;
        }
        }
        }
        }
        l++;
        }
        }

        public void topWords()
        {
        int i = 0;
        while (i < 10)
        {
        Node point = file[i];
        while (point != null)
        {
        Node point1 = point.getLink();
        while(point1 != null)
        {
        if (point.getOccur() < point1.getOccur())
        {
        int temp = point.getOccur();
        String w = point.getWord();
        point.setOccur(point1.getOccur()) ;
        point.setWord(point1.getWord());
        point1.setOccur(temp);
        point1.setWord(w);
        }
        point1 = point1.getLink();
        //printingtroughlinkedlist();
        }
        // cout << endl;
        point = point.getLink();
        }//break;
        i++;
        }
        }


        public int maxa(int a[])
        {
        int m = a[0];
        for(int i = 0; i < 10; i++)
        {
        if(a[i] > m)
        m = a[i];
        }
        return m;
        }

        public void printing(int k[])
        {
        int max = maxa(k);
        for(int u = 0; u <= 9 ; u++  )
        {
        for(int p = 0; p <= 9 ; p++  )
        {

        if(k[p] == max && max != 0 )
                System.out.println("File No. :"+(p+1)+" (Occurs "+k[p]+"times)");


        }
        max--;
        }}

        public void arrayy(int array[])
        {
        for(int u = 0; u <= 9 ; u++  )
        array[u]=0;
        }

        public void searchfile()
        {
        int array[]=new int[10];
        int count;
            System.out.println("\n----------------------------------------------------Searching-------------------------------------------------------");
            System.out.println("Enter 0 to Exit");
        while(true)
        {
        String ssword;
            System.out.println("Enter keyword: ");
            ssword=scan.next();

        arrayy(array);
        String sword=ssword.toLowerCase();

        int num =0;

        int x = 0;
        if(ssword.equals("0")){
            System.exit(0);
        break;}

        int k = 0;
        //cout<<"The word ("<<sword<<") appears in the files given below if any "<<endl;
        //cout<<"Following Documents are Retrieved"<<endl;
        count = 0 ;
        while(k <= 9)
        {

        int i = 1;
        Node current = new Node();
        current.setLink(file[k]); 

        while (current != null)
        {

        if(sword .equalsIgnoreCase(current.getWord()))
        {
        int l=k+1;
        //cout<<"File No. : "<<l<<" (Occurs "<<current->occur<<" times)"<<endl;
        //cout<<k<<endl;
        array[k]=current.getOccur();
        x=1;


        }

        i++;
        current = current.getLink();
        //printing(array);
        }
        k++;
        }
        printing(array);



        //MT.Stop();
        //cout<<"Retrieval Time: "<<MT.elapSeconds<<" seconds"<<endl;
        if(x==0)
                System.out.println("No Document Retreived! ");
        //cout<<"---------------"<<endl;
        //cout<<no;
        }




        }


}
