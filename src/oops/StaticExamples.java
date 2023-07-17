package oops;

public class StaticExamples {
	int a=20;
	static int b=10;
	
	static void m1()
	{
		System.out.println("this is static method");
	}
	
	void m2()
	{
		System.out.println("this is not static method");
	}
	void m3()
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		m3();
	}

	public static void main(String[] args) {
//		System.out.println(b); //directly call without creating any object for this variable and methods
//		m1();

		StaticExamples st=new StaticExamples();
//		 System.out.println(st.a);                  we have to create object for this variable and method why beacause of thisis not static 
//		 st.m2();                      // it shows an error 
		st.m3();
	}

}
