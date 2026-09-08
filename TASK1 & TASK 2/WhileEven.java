package DailyTasks;

import java.util.Scanner;

public class WhileEven {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter range");
		int num = scan.nextInt();
		int i = 0;
		while (i < num) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
			
		}
		scan.close();

	}

}
