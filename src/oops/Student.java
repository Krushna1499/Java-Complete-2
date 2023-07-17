package oops;

public class Student {

	int sid;
	String sname; //these are class variables
	char grade;
	
	Student(int id,String name,char g) //constructor
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	void getValues(int id,String name,char g) //method variables
	{
		sid=id;
		sname=name;
		grade=g;
	}
	void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);
	}
}
