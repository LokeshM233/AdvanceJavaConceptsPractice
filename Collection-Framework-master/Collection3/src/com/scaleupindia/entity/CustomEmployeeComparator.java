package com.scaleupindia.entity;

import java.util.Comparator;

/**
 * @author abhishekvermaa10
 *
 */
public class CustomEmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
