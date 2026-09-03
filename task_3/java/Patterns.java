package com.task_3.java;

public class Patterns {

	public static void main(String[] args) {
		int i;
		int j;
        int n =5;
		for ( i = 1; i <= n; i++) {
			for ( j = 1; j <= n; j++) {
				if (i==1||i==5||j==1||j==5) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("==========================================");
		for (i = 1;  i<=6 ; i ++) {
			for (j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 5;  i>=1 ; i --) {
			for (j = 1; j <= i; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
