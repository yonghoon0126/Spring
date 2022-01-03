package test7;

import java.util.ArrayList;

public class Student {

	private String name;
	private int age;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	
	
	public Student(String name, int age, ArrayList<String> hobby) {
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}


	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}


	public double getHeight() {
		return height;
	}


	public double getWeight() {
		return weight;
	}


	public ArrayList<String> getHobby() {
		return hobby;
	}
	
	
	
	
}
