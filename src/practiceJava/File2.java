package practiceJava;

import java.io.File;
import java.io.IOException;

public class File2 {
public static void main(String[] args) {
	File Obj = new File("D:\\Software Development\\spring-tool-suite-4-4.18.1.RELEASE-e4.27.0-win32.win32.x86_64.self-extracting\\sts-4.18.1.RELEASE\\file.txt"); 
	try {
		if(Obj.createNewFile()) {
			System.out.println("File created:"+Obj.getName());
		}else {
			System.out.println("File not created");
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Error occurs");
	}
}
}
