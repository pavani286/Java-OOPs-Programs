package OOPSConcepts;

public class NestedStaticExample{
	
	//static class
      static class StaticKeyword {
    	  String s= "this is non static global varaible";
    	  static int e;//static global varaible
    	  static int i=10;
    	  
	public void Addition(int a,int b) {
		int result = a + b; //result is a local varaible
		System.out.println("Addition is:"+result);
		result = e;
		
	}
	public static void Subraction(int c, int d) {
		int result1 = c - d;//result1 is a local varaible
		System.out.println("subraction is :"+result1);
	}
	public void disp() {
		System.out.println("non-static disp method is called...");
	}
	public static void main(String[] args) {
		
		NestedStaticExample.StaticKeyword s1 = new NestedStaticExample.StaticKeyword();
          s1.Addition(2, 2);
          //Subraction(5, 5); 
          StaticKeyword.Subraction(8,4);    //staic methos calling with class name 
          //Subraction(9,5);                //static method calling with method name 
          s1.disp();                        //non-static method is called by the object references of the class
          System.out.println(s1.s);         //non static varaible is called by object references(s1)of the class
          System.out.println("Static variable is called by the class name also...i ="+StaticKeyword.i);//static variable is called by the class name or we call i itself 
          System.out.println("Static variable can also be called by itself ...i ="+i);
	     }

     }
}
