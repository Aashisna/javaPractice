package practiceJava;

import java.util.Scanner;

public class discount {
	public static void main(String[] args) {
		
		int OneQuantity =100;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter totalQuantity");
		//int totalquantity = sc.nextInt();
		System.out.println("Enter total quantity");
		int totalQuantity = sc.nextInt();
		int total = totalQuantity*100;
		int comparision =1000;
		if(total>comparision) {
			int discount = total-100;
			System.out.println("your total amount is:"+discount);
			//int finalcost = total-discount;
			//System.out.println("You total amount is:" + finalcost);
		}
	}

}
