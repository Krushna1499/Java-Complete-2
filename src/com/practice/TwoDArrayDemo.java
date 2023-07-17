package com.practice;

public class TwoDArrayDemo {

	public static void main(String[] args) {
	/*int a[][]=new int[2][3];
	a[0][0]=100;
	a[0][1]=200;
	a[1][0]=300;
	a[1][1]=400;
	System.out.println("Number of rows"+a.length); //prit no rows
	System.out.println("Number of columns"+a[0].length); */
		//int b[][]=new int[3][2];
		int a[][]= {{100,200},{150,250},{200,300}};
		/*for(int i=0;i<a.length;i++)
		{
			for(int j=0;i<a[i].length;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		*/
	
	//Enhanced fro loop
		for(int r[]:a)
		{
			for(int i:r)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	
	
	
	
	
	}
	
	
	

}
