package practiceJava;
import java.util.Scanner;

public class string {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("My name is:" + name);
		System.out.println("i love candies");
		String favOne = sc.next("I love candies");
	}

}
