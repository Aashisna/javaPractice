package practiceJava;

import java.util.Map;

public class HashMap3 {
	public static void main(String[] args) {
		  java.util.HashMap<Integer,String> hm=new java.util.HashMap<Integer,String>();    
	      hm.put(100,"Amit");    
	      hm.put(101,"Vijay");    
	      hm.put(102,"Rahul");   
	      System.out.println("Initial list of elements:");  
	      
	      for(Map.Entry m:hm.entrySet())  
	      {  
	         System.out.println(m.getKey()+" "+m.getValue());   
	      } 
	      System.out.println();
	      
	      System.out.println("Updated list of elements:");  
	      hm.replace(101, "Aashisna");
	      for(Map.Entry m:hm.entrySet())  
	      {  
	         System.out.println(m.getKey()+" "+m.getValue());   
	      }  
	      
	      System.out.println();
	      System.out.println("Updated list of elements:");  
	      hm.replace(101, "Aashisna","Ravi");  
	      for(Map.Entry m:hm.entrySet())  
	      {  
	         System.out.println(m.getKey()+" "+m.getValue());   
	      }  
	      System.out.println();
	      System.out.println("Updated list of elements:");  
	      hm.replaceAll((k,v) -> "Kritika");
	      for(Map.Entry m:hm.entrySet())  
	      {  
	         System.out.println(m.getKey()+" "+m.getValue());   
	      } 
	   
	}

}
