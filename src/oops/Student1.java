package oops;

public class Student1 {

	int SID;
	String Sname;
	int Sub1;
	int Sub2;
	int Sub3;
	void getStuData(int id, String name)
	{
		SID=id;
		Sname=name;
		System.out.println(id);
		System.out.println(name);
	}
	void getStuMarks(int sub1,int sub2,int sub3)
	{
		Sub1=sub1;
		Sub2=sub2;
		Sub3=sub3;
		System.out.println(sub1+" "+sub2+" "+sub3);
	}
	void totalMarks()
	{
		int res;
		
		System.out.println(res=Sub1+Sub2+Sub3);
	}
	public static void main(String[] args) {
		Student1 s1=new Student1();
		s1.getStuData(1, "Krishna");
		s1.getStuMarks(85, 40, 60);
		s1.totalMarks();
		
		

	}

}
