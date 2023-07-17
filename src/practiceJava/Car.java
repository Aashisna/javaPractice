package practiceJava;

public class Car extends Vehicle{
	String name ="Audi";
		void  parts() {
			//String name ="Audi";
			System.out.println("I am a type car");
		}
		public static void main(String[] args) {
			//Vehicle c = new Vehicle();
			Car  d = new Car();
			//c.parts();
			d.parts();
			System.out.println("Hy i am:"+d.name);
		}
		
	
}
