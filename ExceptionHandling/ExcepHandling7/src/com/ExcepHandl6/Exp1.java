package com.ExcepHandl6;

import com.ExcepHandl6.service.CalculatorService;
import com.ExcepHandl6.service.impl.CalculatorServiceImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class Exp1 {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		try {
			System.out.println("---SCENARIO 1---");
			calculatorService.divide(10, 2);
			System.out.println("---SCENARIO 2---");
			calculatorService.divide(10, 0);
		} catch (Exception exception) {
			System.out.println("Something went wrong : " + exception);
		}
	}
}
