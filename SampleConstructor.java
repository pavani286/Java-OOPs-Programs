package OOPSConcepts;

public class SampleConstructor {

	int a=10,b=20;
	public SampleConstructor() {
		
		super();
		System.out.println("Person class Constructor");
		
	}
	public void CopyConstructor(SampleConstructor n) {
		a = n.a;
		b = n.b;
	}
	
	public static void main(String[] args) {
		SampleConstructor n = new SampleConstructor();
		 System.out.println("Value of a: " +n.a); 
		 System.out.println("Value of b: " +n.b); 

	}

}
