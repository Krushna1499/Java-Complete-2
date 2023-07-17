package com.practice;

public class Array1D {

	public static void main(String[] args) {
		int a[]= {10,30,50,40,60,70,80,100};
		int num =100;
		
		boolean flag=false;
		
		for(int i:a)
		{
//			System.out.println(i);
			if(i==num)
			{
				System.out.println("Elements in an array");
				flag=true;
				break;
			}
			
		}
		if(flag==false)
		{
		System.out.println("Element not found");
		}
	}

}
