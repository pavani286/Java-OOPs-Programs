package OOPSConcepts;
interface Vechicle
  {
	 void drivingmode();
	 void parkingmode();
	 void reversing();
	 static int i=10;
	 public static void sportmode() {
		 System.out.println(" Car is in Sportmode"+i);
	 }
	 
  }

//The static methods in interfaces are similar to default methods 
//but the only difference is that you can’t override them. 
//Now, why do we need static methods in interfaces if we already have default methods?

//Suppose you want to provide some implementation in your interface 
//and you don’t want this implementation to be overridden in the implementing class, 
//then you can declare the method as static.
	
class Car implements Vechicle
{
   
	public void drivingmode() {
		System.out.println(" Car is in driving mode");
	}
	public void reversing() {
		System.out.println(" Car is in Reverse Mode");
		
	}
	public void parkingmode() {
		System.out.println(" Car is in Parking Mode");
		
	}
class bike implements Vechicle
	{

		@Override
		public void drivingmode() {
			// TODO Auto-generated method stub
			System.out.println(" Bike is in Driving Mode");
		}

		@Override
		public void parkingmode() {
			// TODO Auto-generated method stub
			System.out.println(" Bike is in Parking Mode");
		}

		@Override
		public void reversing() {
			// TODO Auto-generated method stub
			
		}
     }
}