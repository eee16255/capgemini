package com.capg.Package1;

import com.capg.package3.GrandParent;

public class Parent extends GrandParent{
	public Parent(String s2) {
		displayGrand();
		System.out.println("from parent constructor.."+s2);
	}
	protected void show() {
		
		System.out.println("from parent....");
	}

}
  