
package com.capg.demo;

public class Demo {
	 
	public static void main(String args[]) {
		Rectangle smallRectangle=new Rectangle(3,5);
		smallRectangle.findArea();
		smallRectangle.findPerimeter();
		System.out.println(smallRectangle.getln());
		smallRectangle.setln(5);
		
	}

}

class Rectangle{
	int l,b;
	public int getln() {
		return l;
	}
	public void setln(int l) {
		l= 3;
		System.out.println(l);
		
	}
	public Rectangle(int ln,int bre) {
		l=ln;
		b=bre;
		
	}
	public void findArea() {
		int area=l*b;
		System.out.println("area= "+area);
       
		
	}
	public void findPerimeter() {
		int perimeter=2*(l+b);
		System.out.println("perimeter:"+perimeter);
	}
}
