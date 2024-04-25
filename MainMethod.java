
public class MainMethod {
	
		public static void main(String[] args) 
		{
		CDPlayer m= new CDPlayer();
		DigitalPlayer d = new DVDPlayer();
		d.Play();
		DigitalPlayer d1 = new CDPlayer();
		d1.Quit();
		m.Play();
		ComboDriver c = new DVDPlayer();
		c.Burn();
		c.Quit();
		ComboDriver c1 = new CDPlayer();
		c1.Burn();
		
	}


}
