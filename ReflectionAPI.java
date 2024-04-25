import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionAPI 
 {
	public static void main(String[] args) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException 
	{
		
		String x = "SampleTest";
        Method method = ReflectionAPI.class.getMethod(x,String.class);
        method.invoke(method, "hello");
		
	}
	 public static void SampleTest(String x)
	 {
		 System.out.println("the sample test is "+x);
	 }

 }
