package com.test1.question3;

import java.util.Arrays;

public class MainClass 
{
	public static void main(String args[])
	{
	int[] array1= {1,1,2,3,1};
	int[] array2= {1,1,2,4,1};
	int[] array3= {1,1,2,1,2,3};
	
	checkSequence(array3);
	}
	


	public static void checkSequence(int[] array)
	{
		StringBuilder sb=new StringBuilder();
	
	for(int i=0;i<array.length;i++)
	{
		sb.append(String.valueOf(array[i]));
	}
	System.out.println(sb);
	boolean ans=false;
	if(sb.toString().contains("123"))
	{
		ans=true;
		
	}
	System.out.println(ans);
	}
	
}