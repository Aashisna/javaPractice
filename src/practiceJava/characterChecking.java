package practiceJava;

public class characterChecking {
	public static void main(String[] args) {
		
		String check= "Umbrella";
		boolean per =true;
		
		for(int i=0; i<check.length(); i++){
			
			if(check.charAt(i)=='e') {
				//per =false;
				System.out.println(per);
				break;
			}
			
		}
	}

}
