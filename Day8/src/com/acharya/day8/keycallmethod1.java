package com.acharya.day8;
class S2
{
	void v(S2 a) {
		System.out.println("method is invoked");
	}
	void p() {
		v(this);
	}
}

public class Keycallmethod1 {

	public static void main(String[] args) {
		        S2 s=new  S2();
		        S.p();

	}

}
