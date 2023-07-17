package oops;

class parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class child1 extends parent   //child class of parent
{
	int b;
	void print()
	{
		System.out.println(b);
	}
}
 
class child2 extends child1  //child class of child1  --this is multlevel inheritance
{
	int c;
	void show()
	{
		System.out.println(c);
	}
}

public class SingleInheritance {
	
	public static void main(String[] args) {
		parent p=new parent();
		p.a=10;
		p.display();
		
		child1 c=new child1();
		c.a=15;
		c.b=20;
		c.display();
		c.print();
		
		child2 c2=new child2();
		c2.a=18;
		c2.b=22;
		c2.c=14;
		c2.display();
		c2.print();
		c2.show();
		
		
	}

}
