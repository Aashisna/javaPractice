package practiceJava;

public class TestEncap {
public static void main(String[] args) {
	Encapsulation enc = new Encapsulation();
	enc.setName("Aashisna");
	enc.setAge(26);
	enc.setRollno(6);
	System.out.println("My name is:"+enc.getName());
	System.out.println("My age is:"+enc.getAge());
	System.out.println("My rollno is:"+enc.getRollNo());
}
}
