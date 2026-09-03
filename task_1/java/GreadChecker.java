package com.task_1.java;

import java.util.Scanner;

public class GreadChecker {

	public static void main(String[] args) {
		System.out.println("ENTER THE MARKS");
		
		Scanner sc =new Scanner(System.in);
              int marks =  sc.nextInt();
             if(marks < 0 || marks > 100) {
            	 System.out.println("INVALID MARKS");
             }
             else if(marks >= 90) {
            	 System.out.println("GREAD A");
            	 System.out.println("EXCELENT");
             }
             else if(marks >= 75) {
            	 System.out.println("GRADE B");
            	 System.out.println("WELL DONE");
             }
             else if(marks >= 60) {
            	 System.out.println("GRADE C");
            	 System.out.println("VERY GOOD");
             }
             else if(marks >= 40) {
            	 System.out.println("GRADE D");
            	 System.out.println("GOOD");
             }
             else {
            	 System.out.println("FAIL");
            	 System.out.println("NEED TO IMPROVE");
             }
             
             sc.close();
	}

}
