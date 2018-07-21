package com.test1.question2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainClass 
{
	public static void main(String args[])
	{
		try {
			Scanner sc=new Scanner(new File("src/data.txt"));
			Scanner sc1=new Scanner(System.in);
			List<Integer> list=new LinkedList<Integer>();
			while(sc.hasNext())
			{
				list.add(sc.nextInt());
			}
			
		
			System.out.println("Enter your choice: 1)Mean, 2)Median, 3)Mode");
			int  option=sc1.nextInt();
			
			switch(option)
			{
			case 1: System.out.println("MEAN");
					Mean(list);
					break;
			case 2: System.out.println("MEDIAN");
					Median(list);
					break;
			case 3: System.out.println("MODE");
					Mode(list);
					break;
			default:
				 System.out.println("Enter Correct choice");
				 break;
				
			}
			System.out.println(list);
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void Mean(List<Integer> list)
	{
		int total=0;
		for(int i:list)
		{
			total=total+i;
		}
		
		System.out.println("Mean"+total/list.size());
		
	}
	
	
	public static void Median(List<Integer> list)
	{
		Collections.sort(list);
		float median;
		if(list.size()%2==0)
		{
			int l1=list.get((list.size()/2)-1);
			int l2=list.get(list.size()/2);
			median=(l1+l2)/2;
		}
		else
		{
			median=list.get((list.size()+1)/2);
		}
		System.out.println("Median"+median);
	}
	
	public static void Mode(List<Integer> list)
	{
		int mode = list.get(0);
		int maxCount = 0;
		for (int i:list) {
		int value = i;
			    int count = 1;

			    for (int j:list) {
			        if (j == value) 
			        	count++;
			        if (count > maxCount) 
			        {
			            mode = value;
			            maxCount = count;
			        }
			    }
			  }
	System.out.println("mode="+mode);
	}
	
	
	
}
