package com.test1.Question5;

import java.util.Scanner;

public class MainClass 
	{
		public static void main(String args[])
		{
			char[] key;
			char[] answer;
			Scanner scanner=new Scanner(System.in);
			key=scanner.nextLine().toCharArray();
			answer=scanner.nextLine().toCharArray();
			scoreUp(key,answer);
		}
	
		public static void scoreUp(char[] key,char[] answer)
		{
			int score=0;
			for(int i=0;i<key.length;i++)
			{
				if(key[i]==answer[i])
				{
					score=score+4;
				}
				else if(key[i]!=answer[i])
				{
					score=score-1;
				}
				else if(answer[i]=='?')
				{
					score=score+0;
				}
			}
			
			System.out.println(score);
		}
	}
