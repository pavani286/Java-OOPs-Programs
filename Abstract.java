package OOPSConcepts;
 abstract class Demo
{
	 abstract void parking();
	 abstract void twowheel();
	 abstract void fourwheel();
	 //partial abstraction means 0 to 100 percent it can have non-abstract methods or abstract methods
	 //only abstract methods is 100% abstraction..
	 public void Nonabstractmethod(){
		 System.out.println("Non-abstract method ....");
		 
	 }
	 public static void staticmethod() {
		 System.out.println("static method ...");
	 }
	
}
