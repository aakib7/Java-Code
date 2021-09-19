package OnlineLab4;

public class Test {

    public static void main(String[] args) {
       
       
        
        Shape [] rec=new Rectangle[3];
        rec[0]=new Rectangle();
        rec[1]=new Rectangle(1,5);
        rec[2]=new Rectangle(2,4,"red",true);
        
       
        Rectangle [] sq=new Square[3];
        sq[0]=new Square();
        sq[1]=new Square(23);
        sq[2]=new Square(3,7,"blue",false);
        sq[0].setSide(10);
        sq[1].setSide(20);
        sq[2].setSide(30);
        
        System.out.println("details of Rectangle:");
        for (Shape rec1: rec) {
            System.out.println(rec1.toString());
            System.out.print("Area="+rec1.getArea());
            System.out.println(" , Parameter="+rec1.getPerimeter());
            System.out.println("");
             
            
        }
        System.out.println("Details of Square:");
        for (Rectangle sq1: sq) {
            System.out.println(sq1.toString());
            System.out.print("Area="+sq1.getArea());
             System.out.println(" , Parameter="+sq1.getPerimeter());
             System.out.println("");
            
        }
        //1) if we remove retArea() method from rectanglr it generates an error because 
        //it is abstract method in parent claa so it must implement
        
        //2) if we remove abstract keyword from class shape it give error because it contains 
        //a abstract method in it.
        
        //3) if we try to generate a Object of Shape it gives a error because the object of
        //abstract class cannot be created.
      
        
        
            
            
        
        

          
    }
    
}
