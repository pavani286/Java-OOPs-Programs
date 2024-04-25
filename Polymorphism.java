package OOPSConcepts;

public class Polymorphism {
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		ClassB b= new ClassB();
		ClassC c= new ClassC();
		//ClassA a2 = new ClassC();
		
		b.M1();
		c.M2();
		a.M3();
		
 /*		c.M1();
		c.M2();
		c.M3();
		
  /*	a.M1();
		b.M2();
		c.M3();
		 
	/*	a2.M1();
		a2.M2();
		a2.M3();
		*/
	   
	}
}
