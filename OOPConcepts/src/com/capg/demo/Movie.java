package com.capg.demo;

public class Movie {

	public static void main(String[] args) {
		movie1 t=new movie1(23,"gsjs","1feb","1","Available") ;
//		t.getName();
//		t.setId(23);
//    	t.setName("rebeca");
//		t.setShowdate("1stfeb2020");
//		t.setShowtime("1");
//		t.setStatus("booked");
//    	
		t.detailsInfo();
		System.out.println(movie1.language);
		
	}
}
class movie1{
	static String language="Telugu";
	private int id;
	private String name;
	private String showdate;
	private String showtime;
	private String status;
	public movie1(int id,String name,String showdate,String showtime,String status) {
		this.id=id;
    	this.name=name;
		this.showdate=showdate;
		this.showtime=showtime;
		this.status=status;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		this.id=id;
	}
	
	public String getName() {
		
		return name;
	}
	
	public void setName(String name) {
		
		    this.name=name;
		
	}
	
	public String getShowdate() {
		return showdate;
	}
	public void setShowdate(String showdate) {
		this.showdate=showdate;
	}
	public String getShowtime() {
		return showtime;
	}
	public void setShowtime(String showtime) {
		this.showtime=showtime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		
		this.status=status;
	}
	public void detailsInfo() {
		System.out.println("enter movie details");
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("showdate="+showdate);
		System.out.println("showtime="+showtime);
		System.out.println("status="+status);
		
	}
}
