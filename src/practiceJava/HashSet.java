package practiceJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HashSet {
	public static void main(String[] args) {
		java.util.HashSet<String> hash = new java.util.HashSet<String>();
		hash.add("Computer Network");
		hash.add("Computer Science");
		hash.add("Artifical Intelligence");
		hash.add("Computer Network");
		hash.add("Image Processing");
		
		for(String i:hash) {
			System.out.println(i);
		}
		List<String> list= new ArrayList<String>();
		list.add("Image Processing");
		//list.add("Artificial Intelligence");
		System.out.println();
		
		System.out.println(hash.contains("Image Processing"));
		
		System.out.println(hash.containsAll(list));
		System.out.println();
		
		System.out.println(hash.size());
		System.out.println();
		
		System.out.println(hash.remove("Image Processing"));
		System.out.println(hash);
		System.out.println();
		hash.clear();
		System.out.println(hash);
	}

}
