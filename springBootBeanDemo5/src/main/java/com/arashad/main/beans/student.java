package com.arashad.main.beans;

public class student {
	
	
	private String name;
	private int rollno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public void display() {
		System.out.println("Name "+name);
		System.out.println("Roll no "+rollno);
	}
}
