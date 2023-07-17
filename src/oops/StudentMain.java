package oops;

public class StudentMain {

	public static void main(String[] args) {
	//Student s1=new Student();
//	s1.grade='A';
//	s1.sid=100;  // By using object reference Variable--[Approach 1]
//	s1.sname="Krishna";
//	s1.display();

	//Approach-2 using method
//	s1.getValues(103, "Abhi", 'A');
//	s1.display(); 

	//Approach-3 using constructor
		Student s1=new Student(100, "Kishya", 'A');
		s1.display();

	}

}
