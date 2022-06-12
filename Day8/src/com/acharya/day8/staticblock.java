package com.acharya.day8;

public class staticblock
{
     int rollno;
     String name;
     static String college="AIT";
     staticblock(int r,String n)
     {
    	 rollno=r;
    	  name=n;
     }
     static
     {
    	college="acharya";
     }
     void display()
     {
    	 System.out.println(rollno+" "+name+" "+college);
     }
	public static void main(String[] args)
	{
		staticblock s1=new staticblock(111,"abdul");
		staticblock s2=new staticblock(222,"vikash");
		s1.display();
		s2.display();

	}

}
