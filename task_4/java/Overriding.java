package com.task_4.java;


class Animal{
	void sound() {
		System.out.println("ANIMAL MAKE SOUNDS");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("DOG BARKS");
	}
}

public class Overriding {

	public static void main(String[] args) {
            Animal a =new Dog();
            a.sound();
	}
}
