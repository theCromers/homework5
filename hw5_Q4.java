package hw5;

import java.util.Scanner;

public class hw5_Q4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a maximum: ");
		int k = input.nextInt();
		while (k < 0) {
			if (k < 0) {
				System.out.println("invalid. Please try again.");
				k = input.nextInt();
			}
		}
		printEvens(k);
	}

	public static void printEvens(int num) {
		for (int i = 0; i <= num; i += 2) {
			if (i <=num && (i + 2) <=num) {
				System.out.print(i + ", ");
			} else {
				System.out.print(i);
			}
		}

	}
}
