package practiceJava;

public class Constructor {
	String modelName;
	int year;

public Constructor(String mName, int date){
	modelName = mName;
	year =date;
	
}
public static void main(String[] args) {
	Constructor cs = new Constructor("Honda",1993);
	System.out.println("Model name is:"+ cs.modelName);
	System.out.println("It is developed in:"+cs.year);
}
}

