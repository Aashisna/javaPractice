package practiceJava;

public class Moose extends Animal implements Herbivore, Wild{

	@Override
	public void liveOutside() {
		// TODO Auto-generated method stub
		System.out.println("Hello i am a moose and i live outside");
		
	}

	@Override
	public void loveGreens() {
		// TODO Auto-generated method stub
		
	}
	
	public void sound() {
		System.out.println("Love to make sound at night");
	}

}
