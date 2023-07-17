package oops;

interface AA
{
	int a=10;
	int b=20;
	void sum();
}


public class Practice implements AA {
	public void sum()
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
	Practice p=new Practice();
	p.sum();
	}

	
}
