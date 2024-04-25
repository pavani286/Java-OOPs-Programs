package OOPSConcepts;
public class Demo1
{
	public static void main(String[] args) 
	{
	     Shape c = new Circle();
	   //  c.draw();
	     c.paint();
	     Shape t = new Triangle();
	     //t.draw();
	     Square s1 = new Square();
	     //s1.draw();
         t.area();
	     c.area();
	     s1.area();
	    PrintShape p = new PrintShape();
	    p.calldraw(c);
	    p.calldraw(t);
	    p.calldraw(s1);
	   
	    
	    
	}

}
