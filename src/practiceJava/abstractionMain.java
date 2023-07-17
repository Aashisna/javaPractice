package practiceJava;

public class abstractionMain {
	public static void main(String[] args) {
		Cow cws = new Cow();
		Cow cw = new Cow();
		cw.Sound();
		cw.Sleep();
		cws.Sleep();
		cws.Sound();
	}

}
