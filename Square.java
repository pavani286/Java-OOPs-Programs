package OOPSConcepts;

public class Square extends Shape
{
  int a = 5 ;
  public void draw()
  {
	  System.out.println("square draw method ....");
  }

public double area() 
{
   double Area = a*a;
	System.out.println("area of square "+Area);
	return Area;
}
}

