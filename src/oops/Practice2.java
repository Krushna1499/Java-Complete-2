package oops;
interface A3
{
	int a=20;
	int b=10;
	void add();
}

interface B3
{
	int x=10;
	int y=20;
	void mul();
}
public class Practice2 implements A3,B3 {

	public void  add()
	{
		System.out.println(a+b);
	}
	public void mul() {
		System.out.println(x*y);
	}
	public static void main(String[] args) {
		Practice2 p =new Practice2();
		p.add();
		p.mul();

	}

}
