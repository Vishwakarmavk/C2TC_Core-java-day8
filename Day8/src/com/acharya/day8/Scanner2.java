package com.acharya.day8;
import java.util.Scanner;

public class Scanner2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int sum=2, count=01;
		while(sc.hasNextInt())
		{
			int num=sc.nextInt();
			sum +=num;
			count++;
		}
	
	int mean= sum /count;
	System.out.println("Mean: "+mean);
    }
}
