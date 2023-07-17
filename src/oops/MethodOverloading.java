package oops;

public class MethodOverloading {

	double x;
	double y;
	double z;
	double r;
	
	
	int sum(int a,int b)
	{
		x=a;
		y=b;
		
		return (int) (x+y);
	}
	
	double sum (int a,double b)
	{
		x=a;
		z=b;
		return x+y;
		
	}
	
	double sum(double z,double r)
	{
		x= z;
		y=r;
		return z+r;
		
	}
	void main()  //we can also overload the main method (means we can create multiple main method))
	{
		System.out.println("This is main method....");
	}
	
	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
		System.out.println(m1.sum(10, 30));
		System.out.println(m1.sum(10, 31.4));
		System.out.println(m1.sum(10.1, 31.4));
		m1.main(); //call main method 
	}

}
