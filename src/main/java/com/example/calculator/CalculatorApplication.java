package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		Scanner scanner = new Scanner(System.in);

		double operand1, operand2;
		System.out.print("Choose operation:\n1. Addition (+)\n2. Subtraction (-)\n3. Multiplication (*)\n4. Division (/)\n5. Natural Logarithm (ln)\n6. Square Root (√)\n7. Factorial (!)\n8. Power Function (x^y)\n Enter your selection: ");
		int operation = scanner.nextInt();

		switch (operation) {
			case 1:
				System.out.print("Enter first number: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter second number: ");
				operand2 = scanner.nextDouble();
				System.out.println("Result: " + performAddition(operand1, operand2));
				break;
			case 2:
				System.out.print("Enter first number: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter second number: ");
				operand2 = scanner.nextDouble();
				System.out.println("Result: " + performSubtraction(operand1, operand2));
				break;
			case 3:
				System.out.print("Enter first number: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter second number: ");
				operand2 = scanner.nextDouble();
				System.out.println("Result: " + performMultiplication(operand1, operand2));
				break;
			case 4:
				System.out.print("Enter numerator: ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter denominator: ");
				operand2 = scanner.nextDouble();
				handleDivision(operand1, operand2);
				break;
			case 5:
				System.out.print("Enter number: ");
				operand1 = scanner.nextDouble();
				System.out.println("Result: " + calculateNaturalLogarithm(operand1));
				break;
			case 6:
				System.out.print("Enter number: ");
				operand1 = scanner.nextDouble();
				System.out.println("Result: " + calculateSquareRoot(operand1));
				break;
			case 7:
				System.out.print("Enter number: ");
				operand1 = scanner.nextDouble();
				System.out.println("Result: " + calculateFactorial(operand1));
				break;
			case 8:
				System.out.print("Enter base (x): ");
				operand1 = scanner.nextDouble();
				System.out.print("Enter exponent (y): ");
				operand2 = scanner.nextDouble();
				System.out.println("Result: " + calculatePower(operand1, operand2));
				break;
			default:
				System.out.println("Invalid operation");
		}

		scanner.close();
	}

	public static double performAddition(double operand1, double operand2) {
		return operand1 + operand2;
	}

	public static double performSubtraction(double operand1, double operand2) {
		return operand1 - operand2;
	}

	public static double performMultiplication(double operand1, double operand2) {
		return operand1 * operand2;
	}

	public static void handleDivision(double numerator, double denominator) {
		if (denominator != 0) {
			System.out.println("Result: " + performDivision(numerator, denominator));
		} else {
			System.out.println("Cannot divide by zero");
		}
	}

	public static double performDivision(double numerator, double denominator) {
		return numerator / denominator;
	}

	public static double calculateNaturalLogarithm(double num) {
		return Math.log(num);
	}

	public static double calculateSquareRoot(double num) {
		return Math.sqrt(num);
	}

	public static double calculateFactorial(double num) {
		if (num == 0) {
			return 1;
		} else {
			return num * calculateFactorial(num - 1);
		}
	}

	public static double calculatePower(double base, double exponent) {
		return Math.pow(base, exponent);
	}
}
