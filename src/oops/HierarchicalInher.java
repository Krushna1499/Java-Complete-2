package oops;

class parent1
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class childa extends parent1
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}

class childb extends parent1
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}

public class HierarchicalInher {
	
	public static void main(String[] args) {
		childa c1 =new childa();
		c1.a=10;
		c1.b=11;
		c1.show();
		c1.display();
		childb cb=new childb();
		cb.a=12;
		cb.c=13;
		cb.show();
		cb.display();
		
		

	}

}
