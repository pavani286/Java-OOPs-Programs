import java.util.Random;


public class RandomString 
{
	public static void main(String[] args) 
	{
		 String x[] = {"Balaji","Aditya","Pavani","Aryan"};
		 Random r = new Random();
          for(int i=0; i<x.length; i++)
          {  
             int random = r.nextInt(4);
        	 System.out.println(x[random]);
          }
         
	}

}
