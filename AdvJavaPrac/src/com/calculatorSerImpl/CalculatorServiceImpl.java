package com.calculatorSerImpl;

import com.calculatorSer.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public void devide(Integer... array) {
		int quotient = 0;
		quotient = array[0]/array[1];
		System.out.println("Quotient of " + array[0] + " and " + array[1] +" is: "+ quotient);
		
	}

}
