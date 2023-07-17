package com.practice;

public class ReverseString {

	public static void main(String[] args) {
		String s="Krishna";
		int len=s.length(); //length of the String
		String rev="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i); //charAt is string method
		}
		System.out.println(rev); 
	}

}
