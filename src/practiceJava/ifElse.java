package practiceJava;
import java.util.Scanner;

public class ifElse {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int l = sc.nextInt();
		System.out.println("Enter breadth");
		int b = sc.nextInt();
		int area;
		/*if(l==b)
		{
			System.out.println("it is a square");
			area = l*l;
			System.out.println("Required area is:"+area);
		}else {
			System.out.println("it is a rectangle");
			area = l*b;
			System.out.println("Required area is5"
					+ ":"+area);
		}*/
		boolean conti=true;
		int small;
	
		if(l<b) {
			small =l;
		
		
		}else {
			small=b;
		}
		System.out.println("the smallest number is:"+small);
		
	
	}

}
