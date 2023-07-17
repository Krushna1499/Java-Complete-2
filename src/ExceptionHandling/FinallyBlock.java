package ExceptionHandling;

public class FinallyBlock {

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
			System.out.println("ArithmeticException is handlled");
		}
		finally
		{
			System.out.println("This is finally block........");
		}
		System.out.println("Program is completed....");
		System.out.println("Program is exited.....");

	}

}
