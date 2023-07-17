package oops;

public class Constructor {
	int x,y;
	Constructor()  //default constructor
	{
		x=100;
		y=200;
		System.out.println(x+y);
	}
	Constructor(int a,int b)  //parameterised constructor
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		Constructor c1=new Constructor();
	

	}

}
