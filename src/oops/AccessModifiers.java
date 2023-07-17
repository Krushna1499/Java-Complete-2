package oops;

class A2
{
	/*private int a=100;
	 private void m1()   				//private access modifier
	{
		System.out.println(a);
	}*/

	/* int a=100;
	  void m1()  				//default access modifier
	{
		System.out.println(a);
	}*/
	
	int a=100;
	  void m1()  				//default access modifier
	{
		System.out.println(a);
	}
	                                          //access modifier
}
public class AccessModifiers {

	public static void main(String[] args) {
		A2 obj =new A2();
		//obj.m1();
	}

}
