package com.task_2.java;

class Employ{
	int id;
	String name;
	double salary;
	public Employ(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	void display() {
		System.out.println("EMPLOY ID     : " +id);
		System.out.println("EMPLOY NAME   : " +name);
		System.out.println("EMPLOY salary : " +salary);
	}
}
public class Main {

	public static void main(String[] args) {
		Employ e1 = new Employ(1,"SUJAY",50000000.0);
		e1.display();
		Employ e2 = new Employ(2,"vijay",5000000.0);
		e2.display();
	}
}
