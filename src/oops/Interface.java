package oops;

interface A
{
	int a=10; //by default variables in interfaces are static and final
	void m1();  // abstract method,by default it is public
}
public class Interface implements A{
	public void m1()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Interface i =new Interface();
		i.m1();

	}

}
