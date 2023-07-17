package oops;

public class Calculation {
	int a,b,c;
	int sum;
	Calculation(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
	}
	void sum()
	{
		System.out.println(sum=a+b+c);
		
	}
//	void display()
//	{
//		System.out.println(a+" "+b+" "+c);
//		System.out.println(sum);
//	}
	public static void main(String[] args) {
		 Calculation c1=new Calculation(10, 20, 35);
		 c1.sum();
		 //c1.display();
	}

}
