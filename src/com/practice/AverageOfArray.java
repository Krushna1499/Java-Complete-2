package com.practice;

public class AverageOfArray {

	public static void main(String[] args) {
		double a[]= {10,20,30,40,55};
		double sum=0;
		for(double i:a)
			{
			sum=sum+i;
		}
		double average=sum/a.length;
		System.out.println("average of array is: "+average);

	}

}
