package com.calculatorSerImpl;

import java.io.IOException;

import com.calculatorSer.CalculatorService;
import com.calculatorUtility.CustomResource;
import com.calculatorUtility.CustomResource2;

public class CalculatorServiceImpl implements CalculatorService {
	@Override
	public void devide(Integer... array) throws IOException {
		int quotient = 0;
		CustomResource customResource = new CustomResource();
		CustomResource2 customResource2 = new CustomResource2();
		try(customResource; customResource2) {	// Using try-with-resources to ensure resource is closed
		if(array[1] == 0) {
			throw new IOException("Cannot divide by zero "+ array[0]+" by "+array[1]);
		}
		customResource.process();
		customResource2.process();
		quotient = array[0]/array[1];
		System.out.println("Quotient of " + array[0] + " and " + array[1] +" is: "+ quotient);
	} 
	catch(Exception exception) {
		System.out.println("Exception handled in: " + this.getClass()+" is "+ exception.getMessage());
		throw exception;
	}
		finally {
			System.out.println("Finally block executed in: " + this.getClass());
			customResource.close();
			customResource2.close();
		}
	}
}
// This code defines a CalculatorServiceImpl class that implements the CalculatorService interface.
