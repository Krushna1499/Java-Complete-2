package com.practice;

public class Ngtiv_postve_Array {

	public static void main(String[] args) {
		int a[]= {10,-10,15,-20,70,-22};
		for(int i:a)
		{
			if(i>=0)
			{
				System.out.println("Postive Numbers: "+i);
			}
		}
		System.out.println("-------------------------------------------");
		for(int i:a)
		{
			if(i<=0)
			{
				System.out.println("Negative Numbers: "+i);
			}
		}


	}

}
