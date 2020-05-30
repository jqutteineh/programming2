package procedural.example;

import java.util.Scanner;

public class Procedural {
	public static void main(String[] args) {
		int firstNumber = read(1);
		int secondNumber =read(2);
		int thirdNumber = read(3);
		int sum = firstNumber + secondNumber  + thirdNumber;
		System.out.println("Sum = " + sum);
		int avg = (firstNumber + secondNumber   + thirdNumber) / 3;
		System.out.println("Your avg is : " + avg);
	}

	public static int read(int index) {

		return read("Enter value #" + index + " : ");

	}

	public static int read(String msg) {
		Scanner s = new Scanner(System.in);
		System.out.print(msg);
		int n = s.nextInt();
		return n;
	}
}