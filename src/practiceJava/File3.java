package practiceJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File3 {
	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("D:\\Software Development\\spring-tool-suite-4-4.18.1.RELEASE-e4.27.0-win32.win32.x86_64.self-extracting\\sts-4.18.1.RELEASE\\data.txt");
			myWriter.write("Hello my name is Aashisna Thapaliya" + "\n" + "I live in jarankhu"+ "\n");
			myWriter.close();
			//Scanner sc = new Scanner(myWriter);
			System.out.println("File is created and successfully wrote on the file");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
