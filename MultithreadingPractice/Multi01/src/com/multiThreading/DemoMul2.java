package com.multiThreading;

import com.multiThreading.repository.EmployeeRepository;
import com.multiThreading.repository.impl.EmployeeRepositoryImpl1;
import com.multiThreading.repository.impl.EmployeeRepositoryImpl2;
import com.multiThreading.repository.impl.EmployeeRepositoryImpl3;
import com.multiThreading.service.impl.EmployeeServiceImpl;

public class DemoMul2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " started fetching");
		EmployeeServiceImpl employeeServiceImpl = null;
		EmployeeRepository[] employeeRepositories = { new EmployeeRepositoryImpl1(), new EmployeeRepositoryImpl2(),
				new EmployeeRepositoryImpl3() };
		
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < employeeRepositories.length; i++) {
			employeeServiceImpl = new EmployeeServiceImpl(employeeRepositories[i]);
			employeeServiceImpl.start();
		}
		
		System.out.println("Completed in " + (System.currentTimeMillis() - startTime) + " milliseconds");
		System.out.println(Thread.currentThread().getName() + " finished fetching");
	}
}
