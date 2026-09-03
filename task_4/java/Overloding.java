package com.task_4.java;



class Calculator{
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void add(int a ,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(double a,double b) {
		System.out.println(a+b);
	}
}

public class Overloding {

	public static void main(String[] args) {
       
		Calculator c = new Calculator();
		c.add(52, 35);
		c.add(20, 40, 80);
		c.add(5.85, 0.452);
	}

}
