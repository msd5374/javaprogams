package mainpack;

// import package.shapepack;
import shapepack.shapes;

//import shapepack.*;



public class Mainclass extends shapes
{
 public static void main(String[] args)
  {
   float cir,sqr,rect;
   System.out.println("hello this is mainpack");
    shapes s5=new shapes();
   shapes.Circle c1=s5.new Circle(4);
   shapes.Rectangle r1=s5.new Rectangle(4,5);
   shapes.Square s1=s5.new Square(5);
   cir=c1.area();
   rect=r1.area();
   sqr=s1.area();
System.out.println("area of circle is"+" "+cir);
System.out.println("area of rectangle is"+" "+rect);
System.out.println("area of square is"+" "+sqr);
   System.out.println("exiting from mainpack");  
  } 
}
