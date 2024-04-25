
public class CDPlayer implements DigitalPlayer,ComboDriver
{
	int i=8;
  

	@Override
	public void Burn() {
		// TODO Auto-generated method stub
		System.out.println("CDPlayer is Burning ");
	}

	@Override
	public void Quit() {
		// TODO Auto-generated method stub
		System.out.println("Exiting the CDPlayer");
	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("CDPlayer is Playing.. ");
	}
	

	

}
