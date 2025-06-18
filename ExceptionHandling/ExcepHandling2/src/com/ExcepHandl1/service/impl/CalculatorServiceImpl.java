package com.ExcepHandl1.service.impl;

import com.ExcepHandl1.service.CalculatorService;

/**
 * @author abhishekvermaa10
 *
 */
public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public void divide(Integer... array) {
		int quotient = 0;
		try {
			quotient = array[0] / array[1];
			System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
		} catch (ArithmeticException exception) {
			exception.printStackTrace();
		}
	}
}
