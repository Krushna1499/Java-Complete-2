package oops;

public class Animal {
	String color="white";
	void eating()
	{
		System.out.println("Eattting..............");
		
	}
}
	
	class Dog extends Animal
	{
		String color="Black";
		void eating()
		{
			System.out.println("Eattting.....bread.........");
			super.eating();
			
		}
		
	 void show()
		{
			System.out.println(color); //white
			System.out.println(super.color);
		}
	}

	

