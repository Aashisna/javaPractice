package practiceJava;

import java.io.File;
import java.io.IOException;

public class File1 {
	public static void main(String[] args) {
		File Obj = new File("file.txt");
		try {
			if(Obj.createNewFile()) {
				System.out.println("File created:"+Obj.getName());
			}else {
				System.out.println("File not created");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
