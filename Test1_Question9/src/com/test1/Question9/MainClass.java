package com.test1.Question9;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainClass 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int array_size=sc.nextInt();
		int array[]=new int[array_size];
		for(int i=0;i<array_size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int pairs=solution(array);
		System.out.println(pairs);
	}

	public static int solution(int array[])
	{
		int zero=0;
		int pairs=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
			{
			zero++;	
			}
			
			if(array[i]==1)
			{
				pairs=pairs+zero;
			}
		}
		return pairs;
		
	}
}
