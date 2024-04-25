package OOPSConcepts;

public class Abstractimplements extends Demo
{

	public static void main(String[] args) 
	{
		Abstractimplements a = new Abstractimplements(); //static polymorphism
		a.fourwheel();
        a.twowheel();
        a.parking();
        a.Nonabstractmethod();
        staticmethod();
        
	    Demo d = new Abstractimplements();  //dynamic polymorphism or runtime polymorphism
		d.Nonabstractmethod(); //Nonabstractmethod
		d.parking();
		d.twowheel();
		d.fourwheel();
		staticmethod();
	}

	@Override
	void parking() 
	{
		System.out.println("parking fees are ");
		
	}

	@Override
	void twowheel() 
	{
	   System.out.println("twowheeler parking fee is $2");
	}

	@Override
	void fourwheel() 
	{
		System.out.println("fourwheeler parking fee is $4");
	}

}
