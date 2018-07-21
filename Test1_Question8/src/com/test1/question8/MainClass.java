package com.test1.question8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MainClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int result;
		int a[]= new int[k];
		for(int i=0;i<k;i++)
		{
			a[i]=sc.nextInt();
		}
		
		result=Solution(a);
		System.out.println(result);
	}
	
	public static int Solution(int a[])
	{
		List<Integer> temp=new ArrayList<Integer>();
		int min_val=Integer.MIN_VALUE;
		if(a.length==0)
		{
			min_val= 1;
		}
		for(int i=0;i<a.length;i++)
		{
			temp.add(a[i]);
		}
		Collections.sort(temp);
		System.out.println(temp);
		
		int max=temp.size()-1;
		for(int i=1;i<max;i++)
		{
			if(!temp.contains(i))
			{
				min_val=i;
				break;
			}
		}
	return min_val;
	}
	
}
