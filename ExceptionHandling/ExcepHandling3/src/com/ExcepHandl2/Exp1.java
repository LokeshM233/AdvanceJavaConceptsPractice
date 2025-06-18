package com.ExcepHandl2;

import com.ExcepHandl2.service.CalculatorService;
import com.ExcepHandl2.service.impl.CalculatorServiceImpl;

/**
 * @author abhishekvermaa10
 *
 */
public class Exp1 {
	public static void main(String[] args) {
		CalculatorService calculatorService = new CalculatorServiceImpl();
		System.out.println("---SCENARIO 1---");
		calculatorService.divide(10, 2);
		System.out.println("---SCENARIO 2---");
		calculatorService.divide(10);
	}
}
