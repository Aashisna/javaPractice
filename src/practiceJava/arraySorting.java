package practiceJava;
import java.util.ArrayList;
import java.util.Collections;

public class arraySorting {
	public static void main(String[] args) {
	ArrayList<String> surname = new ArrayList<String>();
	surname.add("Thapaliya");
	  surname.add("Dotel");
	  surname.add("Bartaula");
	  surname.add("Neupane");
	  surname.add("Timilsina");
	  for(String s:surname) {
			 System.out.println(s);
		 }
	  Collections.sort(surname);
	  System.out.println();

	 for(String s:surname) {
		 System.out.println(s);
	 }
	}

}
