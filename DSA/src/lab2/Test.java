/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author aaqib
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int m=0;
        int n=0;
        m=Integer.parseInt(args[0]);
        n=Integer.parseInt(args[1]);
        Point[][]map=new Point[m][n];
       
        
       

        for (int i = 0; i < map.length; i++) {
            for(int j=0;j<map[i].length;j++){
             Point p=new Point();
            map[i][j]=p;
         if(p.x<p.y){
             System.out.print(map[i][j]);}
          
        }
           
             System.out.println();
    }
      System.out.println("Whole array");
          for(Point[] a: map){
                for (Point b:a) {
                   
                    System.out.print(b+",");
                }
              System.out.println();
        }
    }}
