package com.acharya.day8;
class s2
{
	void v(s2 a) {
		System.out.println("method is invoked");
	}
	void p() {
		v(this);
	}
}

public class Keycallmethod1 {

	public static void main(String[] args) {
		        s2 s=new  s2();
		        s.p();

	}

}
