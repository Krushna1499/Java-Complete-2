package com.practice;

public class ArrayDemo {

	public static void main(String[] args) {
		/*int a[]=new int [3]; //static array declaration fixed size
		a[0]=100;
		a[1]=200;
		a[2]=300;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		int a[]= {100,200,300,400,500}; //dyanamic array decleration 
		System.out.println(a.length); //length of an array
		
		/*System.out.println(a[1]); //extract specific values
		for(int i=0;i<a.length;i++) //to print all the array values
		{
			System.out.println(a[i]);
		}*/
		
		//enhanced for loop
		
		for(int i:a)
		{
			System.out.println(i);
		}

	}

}
