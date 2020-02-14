package com.capg.demo;

public class OopDemo {
	public static void main(String args[]) {
	Car duster=new Car(1234, "red", 4);
	Car alto=new Car(5678,"back",4);
	//duster.Car(1234, "red", 4);
	duster.showCarInfo();
	duster.start();
	duster.brake();
	duster.accelerate();
	//alto.setCarData(5678,"black", 5);
	alto.showCarInfo();
	
	}
}
class Car{
	private int regNo;
	private String color;
	private int noOfWheels;
	public Car(int reg,String col,int n) {
		regNo=reg;
		color=col;
		noOfWheels=n;
	}
	public void accelerate() {
		System.out.println("Running.....");
	}
	public void brake() {
		System.out.println("Stopped.....");
		
	}
	public void start() {
		System.out.println("Engine Started...");
	}
	public void showCarInfo() {
		System.out.println("regNo :"+regNo);
		System.out.println("color :"+color);
		System.out.println("noOfWheels:"+noOfWheels);
	}
}
