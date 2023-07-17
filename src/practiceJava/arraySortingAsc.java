package practiceJava;

public class arraySortingAsc {
	public static void main (String [] args) {
		String [] frndname = { "Aashisna","Sujan","Rashmi","Zebra","Rita"};
		String temp ="";
	
		
		for(int i=0; i<frndname.length ; i++) {
			System.out.println(frndname[i]);
			for(int j=i; j<frndname.length; j++) {
				if(frndname[i].compareTo(frndname[j])>1) {
					temp  =frndname[i];
					frndname[i] = frndname[j];
					frndname[j] =temp;
					
				}
				System.out.println(temp);
			}
			
		}
	}

}
