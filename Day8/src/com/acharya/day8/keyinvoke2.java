package com.acharya.day8;

class Demo{
	   Demo()
	   {
		 System.out.println("hello a");
	   }
	   Demo(int x)
	   {
		   this();
		   System.out.println(x);
	   }
}
public class keyinvoke2 {

	public static void main(String[] args) {
          Demo a=new Demo(10);
          

	}

}
