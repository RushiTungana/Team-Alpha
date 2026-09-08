package DailyTasks;

import java.util.Scanner;

public class DoWhileReverseNum {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter num here:");
		int num = scan.nextInt();
		int i = 0;

		do {
			System.out.println(num);
			num--;

		} while (num > i);
		scan.close();

	}
}
