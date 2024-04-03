package com.Sample;

public class ComSample {
	private static final String Runs = null;
	private String name;
	private int age;
	private int runs;

	public String getname() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
		
	}
	
	public String toString() {
		return "CSK[Name="+name+", Age="+age+", Runs="+runs+"]";
	}

	
	public static void main(String[] args) {
		ComSample obj= new ComSample();
		obj.setName("Dhoni");
		obj.setAge(20);
		obj.setRuns(50);
		
		System.out.println(obj);
	}
		

	}
