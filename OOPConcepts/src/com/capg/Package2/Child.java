package com.capg.Package2;
import com.capg.Package1.Parent;


public class Child extends Parent {
	public Child(String s1,String s2) {
		super(s1);
		System.out.println("child constructor:"+s2);
	}
	public void display() {
		super.show();
		System.out.println("from child..");
	}
	
	

}
 