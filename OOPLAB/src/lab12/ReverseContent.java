/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author aaqib
 */
import java.io.*;
import java.util.*;
public class ReverseContent {
    
   public void reverse() throws FileNotFoundException, IOException{
       write();
       ArrayList<String> list=new ArrayList();
       String words=read();
       System.out.println("Before Reverse: " +words);
       System.out.println("**********After Reverse*******");
       String[] a = words.split(" ");
       for(int i=0;i<a.length;i++){
          list.add(a[i]);
    }
       Collections.reverse(list);
   for (String word : list){	      
           System.out.print(word+" "); 		
      }
       System.out.println("");
      
   }
    
   public void write() throws IOException{ 
       
       System.out.println("**********File Writing*******");
        String filename = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File name: ");
        filename = sc.nextLine();
        PrintWriter wrtStudent = new PrintWriter(new FileWriter(filename,true));
        
        System.out.println("Enter a string: ");
        String words = sc.nextLine();
        wrtStudent.println(words);
        wrtStudent.close();
        System.out.println("The file has been created");}
   
   public String read() throws FileNotFoundException{
   System.out.println("\n**********File Reading*******");
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the filename: ");
        String filename = sc.nextLine();
        
        String word=null;
       
        File fileReaded = new File(filename);
        Scanner scanfile = new Scanner(fileReaded);
        while(scanfile.hasNextLine()){
        word= scanfile.nextLine();}
         scanfile.close();
       
        return word;
        
   }
   
   
    
}
