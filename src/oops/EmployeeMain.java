package oops;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		
		emp1.eid=100;
		emp1.deptno=1; // we can assign in reference variable method 
		emp1.ename="Krishna";
		emp1.job="Developer";
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.deptno=2;
		emp2.eid=101;
		emp2.ename="OMi";
		emp2.job="Developerr";
		emp2.display();
		

	}

}
