package practiceJava;
import java.util.ArrayList;
import java.util.Collections;

public class arrayListSortingintegerType {
	public static void main(String[] args) {
		ArrayList<Integer> intMynumbers = new ArrayList<Integer>();
		intMynumbers.add(5);
		intMynumbers.add(2);
		intMynumbers.add(1);
		intMynumbers.add(4);
		intMynumbers.add(3);
		intMynumbers.add(6);
		
		System.out.println(intMynumbers);
		Collections.sort(intMynumbers);
		System.out.println();
		System.out.println(intMynumbers);
		System.out.println();
		for(int num:intMynumbers) {
			System.out.println(num);
		}
		
	}

}
