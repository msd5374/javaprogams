package shapepack;

public abstract class areas
{
  public abstract float area();
}


public class shapes extends areas{

class Circle
{
int radius;
float pi=3.14f;

     Circle(int r)
        {
        radius=r;
        }

   public float area()
        { 
        return (2*pi*radius);
        }
  
    
    
}


class Rectangle 
{
 int length;
 int breadth;
  
    
	   Rectangle(int l, int b)
           {
  	    length=l;
 	    breadth=b;
           }
         public  float area()
           {
   	    return (length*breadth);
           }
}


class Square {
 int side;

        Square(int s)
       {
         side=s;
 	}

      public float area()
	{
  	 return side*side;
	}
}

}
