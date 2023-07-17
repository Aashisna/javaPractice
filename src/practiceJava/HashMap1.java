package practiceJava;
import java.util.Map;
public class HashMap1 {
	public static void main(String[] args) {
	Map<String,String> mapNew = new java.util.HashMap<String,String>();
	mapNew.put("Nuwakot","Trishuli");
	mapNew.put("Kathmandu", "Sukedhara");
	mapNew.put("Bhaktapur", "Dhadikot");
	mapNew.put("Lalitpur","Bhaisepati");
	
	for(String i:mapNew.keySet()) {
		System.out.println("Key:" + i+ " " + " " +" " + "value:"+mapNew.get(i));
	}
	}
}
