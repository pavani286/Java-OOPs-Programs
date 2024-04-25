package OOPSConcepts;

public  class Circle extends Shape
{
	int r = 3;
	
	public void draw()
	{
		System.out.println("Circle draw() ");
	}
	
	public double area()
    {
    	double Area = 3.14 * r * r;
    	System.out.println("Area of cricle :"+Area);
    	return Area;
    }

	


}
