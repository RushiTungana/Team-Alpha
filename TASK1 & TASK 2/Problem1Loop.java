package DailyTasks;

import java.util.Scanner;

public class Problem1Loop {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the range::");
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		scan.close();
	}
}
