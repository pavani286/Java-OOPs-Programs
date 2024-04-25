package OOPSConcepts;

public class Triangle extends Shape
{
	int l = 4, b = 8;
  public void draw()
	{
	System.out.println("Triangle draw() ");	
	}
   public double area()
      {
  	double Area = 0.5 * l * b;
  	System.out.println("Area of triangle :"+Area);
  	return Area;
      }
  
}
