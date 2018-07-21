package com.test1.question10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

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
		
		int pairs=solution(array, array.length);
		System.out.println(pairs);
	}

	public static int solution(int[] array, int N)
	{
		int result=0;
		if(N==0)
		{
		return 0;
		}
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
			list.add(array[i]);
		}
		Collections.sort(list);
		int min=list.get(0);
		int max=list.get(list.size()-1);
		
		for(int i=min;i<=max;i++)
		{
			if(!list.contains(i))
			{
				result=0;
				break;
			}
			else
			{
				result=1;
			}
		}
	return result;	
	}
}


