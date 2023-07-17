package oops;

class Bank
{
	double rateOfInterest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	double rateOfInterest()
	{
		return 10.5;
	}
}

class ICICI extends Bank
{
	double rateOfInterest()
	{
		return 12.5;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.rateOfInterest());
		
		ICICI iciobj =new ICICI();
		System.out.println(iciobj.rateOfInterest());

	}

}
