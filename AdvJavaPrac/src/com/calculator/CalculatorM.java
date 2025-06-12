package com.calculator;
import com.calculatorSer.CalculatorService;
import com.calculatorSerImpl.CalculatorServiceImpl;
public class CalculatorM {

	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		System.out.println("Scenario 1: Division of two integers");
		calculatorService.devide(10, 2);
		System.out.println("Scenario 2: Division with zero as the second integer");
		calculatorService.devide(10, 0);

	}

}
