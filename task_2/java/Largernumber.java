package com.task_2.java;

import java.util.Scanner;

public class Largernumber {
	public static int largestNo(int a,int b) {

		if(a>b) {
			return a;
		}else {
			return b ;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int a= sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int b= sc.nextInt();
		System.out.println("LARGEST NUMBER IS : " +largestNo(a,b));
		sc.close();
	}
}
