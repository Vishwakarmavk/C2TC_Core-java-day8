package com.acharya.day8;

public class static2
{         
	int rollno;
	String name;
	static String college="AIT";
    
	static2(int r,String n)
	{
		rollno=r;
		name=n;
	}
	static void change()
	{
		college="acharya";
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}

	public static void main(String[] args)
	{
		static2 s1=new static2(111,"kiran");
		static2 s2=new static2(222,"prajwal");
		change();
		s1.display();
		s2.display();
	}

}
