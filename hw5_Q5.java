package hw5;

import java.util.Scanner;

public class hw5_Q5 {
	public static void main(String[] args) {
		System.out.println("Please input your age: ");
		Scanner age = new Scanner(System.in);
		int a = age.nextInt();
		if (a < 18) {
			System.out.println(
					"I appeciate your enthusiasm, but you are not old enough to vote in the presidential election.");
		} else if (a >= 18) {
			System.out.println(
					"You can vote in the presidential election. Don't forget to register at your polling location.");
		}
	}
}
