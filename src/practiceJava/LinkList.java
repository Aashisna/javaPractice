package practiceJava;
import java.util.LinkedList;

public class LinkList {
	public static void main(String[] args) {
		
		LinkedList<String> cars = new LinkedList<String>();
		cars.add("Audi");
		cars.add("Honda");
		cars.add("Suzuki");
		cars.add("Ford");
		cars.addFirst("BMW");
		cars.addLast("Mazda");
		System.out.println(cars);
		
		System.out.println(cars.getFirst());
		System.out.println(cars.getLast());
		
		cars.removeFirst();
		cars.removeLast();
		System.out.println(cars);
		
	}

}
