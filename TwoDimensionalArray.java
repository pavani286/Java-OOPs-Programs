import java.util.Scanner;


public class TwoDimensionalArray {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
        int i,j;
		
      int arr[][] =new int[7][7];
      for(i=0;i<=arr.length;i++) {
          for(j=0;j<=arr.length;j++) {
          Scanner sca = new Scanner(System.in);
          System.out.println("Enter a Guess:");
          char ch = sca.next().charAt(0);
          int num = sca.nextInt();
          System.out.println("User input is:"+ch+""+num);
          int index = ch - 'A';
          System.out.println("index value is :"+index);
          if(num <= 0) {
           System.out.println("Hit ...");
          
               }
    	  }
      }
       
	}

}
