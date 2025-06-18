package com.ExcepHandl8.service;

import com.ExcepHandl8.exception.ScaleUpIndiaException;

/**
 * @author abhishekvermaa10
 *
 */
public interface CalculatorService {
	void divide(Integer... array) throws ScaleUpIndiaException;
}
