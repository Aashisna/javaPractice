package practiceJava;

public class MainClass {
	public static void main(String[] args) {
		Moose mc = new Moose();
		Cat ct = new Cat();
		ct.liveInside();
		//mc.liveOutside();
		Carnivore c = new Cat();
		mc.liveOutside();
		System.out.println();
		 ct.breath();
		 mc.sound();
	}

}
