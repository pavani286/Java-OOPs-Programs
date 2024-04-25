package OOPSConcepts;

public class MethodOverloading {

	public void disp(int a) {
		System.out.println("a value is:"+a);
	}
	public void disp(char c) {
		System.out.printf("c value is:"+c);
	}
	public void disp(String s,double d) {
		//System.out.printf(s+" "+d);
		System.out.printf("%s,%f",s,d);
	}
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();//we can acheive the static polymorphism or complie time polymorphism
		m.disp(2);                                    //through method overloading 
		m.disp('A');                                 // static methods can be overloaded at compile time 
		System.out.println();
		m.disp("pavani", 10);
	}

}
