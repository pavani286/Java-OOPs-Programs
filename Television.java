
public class Television implements Movies,Games
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing the Movie in Tv....");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Movie is Paused ....");
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("Exiting the Movie ....");
	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Start the Game ....");
	}

	@Override
	public void Quit() {
		// TODO Auto-generated method stub
		System.out.println("Quit the game...");
	}

	

}
