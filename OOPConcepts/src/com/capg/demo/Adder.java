package com.capg.demo;

public class Adder {
	public int add(int a,int b) {
		return a+b;
		
	}
public float add(float a,float b) {
	return a+b;
}
public float add(int a,float b) {
	return a+b;
}
public float add(float a,int b) {
	return a+b;
}
public double add(double a,double b ) {
	return a+b;
}
public String add(String a,String b) {
	return a+b;
}
public String add(String a,float b) {
	return a+b;
}
public static void main(String args[]) {
	Adder a=new Adder();
	int sum=a.add(5, 6);
	float sum1=a.add(15.6f, 20.6f);
	float sum2=a.add(10,13.2f );
	float sum3=a.add(12.8f, 20);
	double sum4=a.add(15.6, 17.4);
	String sum5=a.add("srgf", "dghg");
	String sum6=a.add("gfsg",56);
	System.out.println(sum+"\n"+sum1+"\n"+sum2+"\n"+sum3+"\n"+sum4+"\n"+sum5+"\n"+sum6);
}

}
