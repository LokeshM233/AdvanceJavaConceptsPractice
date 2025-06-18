package com.ExcepHandl2.service.impl;

import com.ExcepHandl2.service.CalculatorService;

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
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Minimum 2 arguments are needed");
		}
	}
}
