package practiceJava;

public class wordChecking {
	public static void main(String [] args)
	{
		String checking = "This is an orange juice";
		boolean result = checking.contains("orange");
		//System.out.println(checking.contains("orange"));
		System.out.println("yes it contains the required word:"+result);
	}

}
