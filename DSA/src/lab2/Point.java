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
import java.util.Random;
public class Point {
    Random rand = new Random(); 
    int x,y;
    
    
    Point(){
        x=rand.nextInt(100);
        y=rand.nextInt(100);
        //y=Math.random();double generate
    }
    
    Point(int a, int b)
    {
        x=a;
        y=b;
    }
    
    double r(){
        return Math.sqrt(x*x+y*y);
    }
    
    double theta(){
        return Math.atan2(y,x);
    }
    
    double distance(Point p){
        double dx=x-p.x;
        double dy=y-p.y;
        return Math.sqrt(dx*dx+dy*dy);}

    @Override
    public String toString(){
        return "("+x+","+y+")";}
}
    
