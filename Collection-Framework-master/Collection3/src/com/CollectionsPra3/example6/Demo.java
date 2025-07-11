package com.CollectionsPra3.example6;

import java.util.Set;
import java.util.TreeSet;

import com.CollectionsPra3.entity.CustomEmployeeComparator;
import com.CollectionsPra3.entity.Employee;

/**
 * @author abhishekvermaa10
 *
 */
public class Demo {
	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<>();
		set.add(new Employee(20, "Harry"));
		set.add(new Employee(10, "Tom"));
		set.add(new Employee(50, "Dick"));

		System.out.println("---DEFAULT---");
		System.out.println("Contents of set are: " + set);

		System.out.println("---SORT BY NAME---");
		Set<Employee> set2 = new TreeSet<>(new CustomEmployeeComparator());
		set2.addAll(set);
		System.out.println("Contents of set are: " + set2);
	}
}
