package com.intiformation.sonnar.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals("Est ce que l'addition est correct", 10, calculator.add(5, 5));
	}

	@Test
	public void testMul() {
		Calculator calculator = new Calculator();
		assertEquals("Est ce que la multiplication est correct", 10, calculator.mul(5, 2));
	}

}
