package com.example.calculator;

import com.example.calculator.CalculatorApplication;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Test
	public void testAddition() {
		double result = CalculatorApplication.performAddition(5, 3);
		Assertions.assertEquals(8, result);
	}

	@Test
	public void testAdditionWithDifferentNumbers() {
		double result = CalculatorApplication.performAddition(10, 20);
		Assertions.assertEquals(30, result);
	}

	@Test
	public void testSubtraction() {
		double result = CalculatorApplication.performSubtraction(5, 3);
		Assertions.assertEquals(2, result);
	}

	@Test
	public void testMultiplication() {
		double result = CalculatorApplication.performMultiplication(5, 3);
		Assertions.assertEquals(15, result);
	}

	@Test
	public void testDivision() {
		double result = CalculatorApplication.performDivision(10, 2);
		Assertions.assertEquals(5, result);
	}

	@Test
	public void testDivisionByZero() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			CalculatorApplication.handleDivision(10, 0);
		});
	}

	@Test
	public void testNaturalLogarithm() {
		double result = CalculatorApplication.calculateNaturalLogarithm(1); // Natural logarithm of 1 is 0
		Assertions.assertEquals(0, result);
	}

	@Test
	public void testSquareRoot() {
		double result = CalculatorApplication.calculateSquareRoot(25);
		Assertions.assertEquals(5, result);
	}

	@Test
	public void testFactorial() {
		double result = CalculatorApplication.calculateFactorial(5); // Factorial of 5 is 120
		Assertions.assertEquals(120, result);
	}

	@Test
	public void testFactorialOfZero() {
		double result = CalculatorApplication.calculateFactorial(0); // Factorial of 0 is 1
		Assertions.assertEquals(1, result);
	}

	@Test
	public void testAdditionNegativeNumbers() {
		double result = CalculatorApplication.performAddition(-5, -3);
		Assertions.assertEquals(-8, result);
	}

	@Test
	public void testAdditionZero() {
		double result = CalculatorApplication.performAddition(0, 0);
		Assertions.assertEquals(0, result);
	}

	@Test
	public void testAdditionLargeNumbers() {
		double result = CalculatorApplication.performAddition(1000000, 2000000);
		Assertions.assertEquals(3000000, result);
	}

	// ... (similar modifications for other test methods)

	@Test
	public void testDivisionFractionalResult() {
		double result = CalculatorApplication.performDivision(10, 3);
		Assertions.assertEquals(3.3333333333333335, result, 0.00001);
	}

	@Test
	public void testDivisionFractionalResultRounded() {
		double result = CalculatorApplication.performDivision(1, 3);
		Assertions.assertEquals(0.3333333333333333, result, 0.00001);
	}

	@Test
	public void testDivisionLargeNumbers() {
		double result = CalculatorApplication.performDivision(1000000, 500000);
		Assertions.assertEquals(2, result);
	}
}
