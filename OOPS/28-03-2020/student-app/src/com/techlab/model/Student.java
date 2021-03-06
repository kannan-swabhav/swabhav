package com.techlab.model;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	public static int count;
	
	static {
		count = 0;
		System.out.println("Inside static block");
	}

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.cgpa = cgpa;
		this.name = name;
		
		count++;
		
		System.out.println("Inside the constructer");
	}

	public Student(int id, String name) {
		this(id, name, (float) 7.0);
	}
	
	public int getStudentCount() {
		return count;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}
}
