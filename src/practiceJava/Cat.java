package practiceJava;

public class Cat extends Animal implements Carnivore,Pet{

	@Override
	public void liveInside() {
		// TODO Auto-generated method stub
		System.out.println("Hello i am a cat and i live inside");
		
	}

	@Override
	public void lovemeat() {
		// TODO Auto-generated method stub
		System.out.println("Hello i am a cat and i love meat");
		
	}

}
