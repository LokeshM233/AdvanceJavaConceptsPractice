package com.ExcepHandl8.service.impl;

import com.ExcepHandl8.exception.ScaleUpIndiaException;
import com.ExcepHandl8.service.CalculatorService;

/**
 * @author abhishekvermaa10
 *
 */
public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public void divide(Integer... array) throws ScaleUpIndiaException {
		int quotient = 0;
		if (array[1] == 0) {
			throw new ScaleUpIndiaException();
		}
		quotient = array[0] / array[1];
		System.out.println("Quotient of " + array[0] + " and " + array[1] + " is " + quotient);
	}
}
