package com.practice;

import java.util.Scanner;

public class SwapNotThird {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a=");
		int a = sc.nextInt();
		System.out.println("Enter a value of b=");
		int b = sc.nextInt();
		System.out.println("Before Swapping "+a+" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After Swapping "+a+" "+b);

	}

}
