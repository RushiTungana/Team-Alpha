package com.task_3.java;


class Student{
	private String name;
	private int age;
	private int marks;
	public String getName() {
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}

public class Encap {

	public static void main(String[] args) {
        Student s = new Student();
        s.setName("SUJAY");
        s.setAge(21);
        s.setMarks(100);
        
        System.out.println("Student Name  : "+s.getName());
        System.out.println("Student Age   : "+s.getAge());
        System.out.println("Student Marks : "+s.getMarks());
	}

}
