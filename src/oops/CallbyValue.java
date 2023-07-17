package oops;

public class CallbyValue {
	int x;

	public void addition(int a)
	{
		x=a+5;
		//System.out.println(x);
	}
	public static void main(String[] args) {
		CallbyValue cv=new CallbyValue();
		
		cv.addition(10);
		System.out.println(cv.x);
	}

}
