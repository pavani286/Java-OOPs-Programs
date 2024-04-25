package OOPSConcepts;

public abstract class Shape 
{
	public abstract void draw();
    public abstract double area();
    
    public void paint()
    {
    	System.out.println("calling the paint method....");
    }
}
