package com.practice;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		double sum=0;
		for(int i:a)
		{
			sum=sum+i/a.length;
		}
		System.out.println(sum);
	}

}
