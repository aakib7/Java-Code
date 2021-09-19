
package OnlineLab4;

public class Rectangle extends Shape {
   protected double width;
   protected double length;
   protected double side;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

  

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
        return length*width;}
    
    
    @Override
    public double getPerimeter(){
    return 2*(length+width);}

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}' + 
                "Shape{" + "color=" + getColor() + ", filled=" + isFilled() + '}';
    }
   
}
