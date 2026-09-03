package com.task_2.java;

import java.util.Scanner;



public class Even_or_odd {
	public static void checkEvenOrodd(int n) {
		if(n%2==0) {
			System.out.println(n+ " IS EVEN");
		}else {
			System.out.println(n+ " IS ODD");
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int n = sc.nextInt();
		checkEvenOrodd(n);
		sc.close();
	}


}

