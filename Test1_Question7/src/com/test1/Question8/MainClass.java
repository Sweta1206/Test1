package com.test1.Question8;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int array[]= {1,2,3,4,5,6};
		System.out.println(array);
		rotate_Array(array, k);
		
	}
	
	public static void rotate_Array(int[] array,int k)
	{
		  int temp,last ;
	        for (int i = 0; i < k; i++) 
	        {
	            last = array[array.length - 1];
	            for (int j = 0; j < array.length; j++)
	            {
	                temp = array[j];
	                array[j] = last;
	                last = temp;
	            }
	          
	        }
	        
	        for(int i=0;i<array.length;i++)
	        {
	        	System.out.print(array[i]+" ");
	        }

	}
}
