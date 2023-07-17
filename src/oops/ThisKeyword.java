package oops;

public class ThisKeyword {
	int a,b;
	
	void add(int a,int b)
	{
		this.a=a;  //we using same method variable as class variables or global variable
		this.b=b;
		
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("sum is:"+(a+b));
	}

	public static void main(String[] args) {
		ThisKeyword th= new ThisKeyword();
		th.add(10, 15);
		th.display();
	}

}
