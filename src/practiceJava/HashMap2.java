package practiceJava;

import java.util.Map;

public class HashMap2 {
public static void main(String[] args) {
	  java.util.HashMap<Integer,String> map=new java.util.HashMap<Integer,String>();//Creating HashMap    
	   map.put(1,"Mango");  //Put elements in Map  
	   map.put(2,"Apple");    
	   map.put(3,"Banana");   
	   map.put(4,"Grapes"); 
	   for(Map.Entry m:map.entrySet()) {
		   System.out.println(m.getKey() +" "+" "+ m.getValue());
	   }
	       
}
}
