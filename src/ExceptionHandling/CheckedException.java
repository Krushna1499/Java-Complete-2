package ExceptionHandling;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
	System.out.println("program is strated....");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	Thread.sleep(5000);
	
	System.out.println("program is complted..");
	System.out.println("program is exited...");

	}

}
