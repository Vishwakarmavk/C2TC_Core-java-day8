package com.acharya.day8;

public class static1
{         
	int rollno;
	String name;
	static String college="AIT";
    
	static1(int r,String n)
	{
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args)
	{
		static1 s1=new static1(111,"kiran");
		static1 s2=new static1(222,"prajwal");
		s1.display();
		s2.display();
	}

}
