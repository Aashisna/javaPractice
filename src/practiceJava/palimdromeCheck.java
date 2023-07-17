package practiceJava;
import java.util.Scanner;

public class palimdromeCheck {
	public static void main(String [] args) {
		String rev = "";
		boolean ans = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String fans = sc.next();
		
		  for (int i = fans.length() - 1; i >= 0; i--) {
	            rev = rev + fans.charAt(i);
	            System.out.println("Required value is:"+rev);
	        }
		  if (fans.equals(rev)) {
	            ans = true;
	        }else {
	        	ans =false;
	        }
		  System.out.println(ans);
		  //boolean A = isPalindrome(fans);
	}

}
