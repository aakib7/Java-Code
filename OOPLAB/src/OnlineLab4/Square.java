
package OnlineLab4;

public class Square extends Rectangle {

    public Square() {
        super();}

    public Square(double side){
    super(side,side);
    this.length=this.width=side;}

    public Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }
   
    @Override
    public void setSide(double side){
     super.side=side; }
    @Override
    public double getSide(){
    return super.side;}
    
    
    @Override
    public void setWidth(double width){
        width=width;
    }
    @Override
     public void setLength(double length) {
        length = length;
    }

    @Override
    public double getArea(){
        return getSide()*getSide();
        
    }
    @Override
    public double getPerimeter(){
        return 4*getSide();
    }
    @Override
    public String toString() {
        return "A Square with side="+getSide()+"area of squre="+getArea()+"perimeter of rectangle="+getPerimeter()+
                "Rectangle{" + "width=" + getWidth() + ", length=" + getLength()+ '}' + 
                "Shape{" + "color=" + getColor() + ", filled=" + isFilled() + '}';
    }
   
}
