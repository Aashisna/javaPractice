package practiceJava;

public class Encapsulation {
	private String aashisnaName;
	private int aashisnaRollno;
	private int aashisnaAge;
	
	public String getName() {
		return aashisnaName;
	}
	public int  getAge() {
		return (aashisnaAge);
	}
	public int getRollNo() {
		return (aashisnaRollno);
	}
	public void setName(String name) {
		aashisnaName = name;
	}
	public void setAge(int age) {
		aashisnaAge  = age;
	}
	public void setRollno(int roll) {
		aashisnaRollno = roll;
	}

}
