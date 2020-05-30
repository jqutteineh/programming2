package gpa;

import java.util.Scanner;

public class GPAcalculator {
	public static void main(String args[]) {

		double currentGpa = 0;
		double totalGpa;
		double sum = 0;
		double totalcredit = 0;
		

		Scanner s1 = new Scanner(System.in);
		System.out.println("How many courses do you have? : ");
		int totalCredits = s1.nextInt();

		for (int i = 0; i < totalCredits; i++) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("Please enter your grade for class #" + (i + 1) + ": ");
			totalcredit = i + 1;
			double grades = s1.nextInt();
			if (grades >= 35 && grades <= 100) {
				sum += grades;
			} else
				System.out.println("invalid input");
		}
		currentGpa = (sum / totalcredit) / 25;
		System.out.printf("Your GPA for this semester is: " + currentGpa);
		
		Scanner s = new Scanner(System.in);
		System.out.println("\nPlease enter your previous GPA: ");
		double previousGpa = s.nextDouble();
		
		totalGpa = (currentGpa + previousGpa) / 2;
		System.out.println("\nYour total GPA is: " + totalGpa);
	}

}
