package com.calculator;
import com.calculatorSer.CalculatorService;
import com.calculatorSerImpl.CalculatorServiceImpl;
public class CalculatorM {

	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		try {
		System.out.println("Scenario 1: Division of two integers");
		calculatorService.devide(10, 2);
		System.out.println("Scenario 2: Division with zero as the second integer");
		calculatorService.devide(10, 0);
		System.out.println("Scenario 3: Division not possible with null values");
		calculatorService.devide(8);
		}
		catch(Exception e) {
		System.out.println("Something went wrong: "+ e);
		}

	}

}
