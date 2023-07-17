package ExceptionHandling;

public class Exception {

	public static void main(String[] args) {
		System.out.println("Program is started.....!");
		System.out.println("Program is in progress");
		int a=100;
		
		try
		{
			System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handlled");
		}
	}

}
