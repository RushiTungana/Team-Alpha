package com.task_2.java;

class Demo {
	int number;
	String name;
	Demo() {
		number = 0;
		name = "Unknown";
	}
	Demo(int number, String name) {
		this.number = number;
		this.name = name;
	}
	void display() {
		System.out.println("Number: " + number);
		System.out.println("Name: " + name);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println("DEFAULT CONSTRUCTOR");
		d1.display();
		System.out.println("==========================");
		Demo d2 = new Demo(123456,"SUJAY");
		System.out.println("PARAMETERIZED CONSTRUCTOR");
		d2.display();
	}
}
