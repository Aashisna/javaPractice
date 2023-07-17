package practiceJava;
import java.util.ArrayList;

public class LoopthroughArrayList {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Aashisna");
		name.add("Aalia");
		name.add("Kritika");
		name.add("Nishma");
		name.add("Astha");
		for(int i=0; i<name.size();i++) {
			System.out.println(name.get(i));
			for(String s:name) {
				System.out.println(s);
			}
		}
	}

}
