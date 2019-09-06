package com.lessons;

public class MyDate {
	private int day;
	private int month;
	private String monthName;
	private int year;
	
	public MyDate(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public MyDate(String monthName,int day,int year) {
		this.day = day;
		this.monthName = monthName;
		this.year = year;
	}
	
	public MyDate(int day,int year) {
		this.day = day;
		this.year = year;
	}
	


}
