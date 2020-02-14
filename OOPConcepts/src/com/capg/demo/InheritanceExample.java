package com.capg.demo;

public class InheritanceExample {
	public static void main(String args[]) {
		B b1=new B();
//		A a=new A();
	    b1.x=15;
		b1.y=20;
		b1.showX();
		b1.showY();
	}
}
	class A{
int x;
public void showX() {
	System.out.println("x="+x);
}
	}
class B extends A{
	int y;
	public void showY() {
		System.out.println("y="+y);
	}
}

