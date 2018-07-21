package com.test1.question4;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int i=sc.nextInt();
	repeatFront(s, i);
	}
	
	
	public static void repeatFront(String input, int number)
	{
		StringBuilder result=new StringBuilder();
		for(int i=number;i>0;i--)
		{
			result.append(input.substring(0,i));
		}
		System.out.println(result);
	}

}
