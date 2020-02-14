package com.capg.demo;

public class Person {

	public static void main(String[] args) {
		person1 t=new person1() ;
//		t.getName();
    	t.setName("rebeca");
		t.setAge(-20);
    	t.setPhoneno(4678775461L);
		t.detailsInfo();
		
		
	}
}
class person1{
	private String name;
	private int age;
	private long phoneno;
//	public person1(String name,int age,long phoneno) {
//		this.name=name;
//		this.age=age;
//		this.phoneno=phoneno;
//	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		
		this.name=name;
	}
	
	public int getAge() {
		
		return age;
	}
	
	public void setAge(int age) {
		if(age>0) 
		    this.age=age;
		else 
			this.age=0;
	
	}
	
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno=phoneno;
	}
	public void detailsInfo() {
		System.out.println("name="+name);
		System.out.println("age="+age);
		System.out.println("phoneno="+phoneno);
		
	}
}