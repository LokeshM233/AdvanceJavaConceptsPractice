package com.collectionPrac;

import java.util.ArrayList;
import java.util.List;
public class Demo {

	public static void main(String[] args) {
		System.out.println("Create a list");
		List<String> list = new ArrayList<>();
		System.out.println("Find the size of the list: ");
		System.out.println("Find the size of the list: " + list.size());
		System.out.println("Display list");
		System.out.println("Display list: " + list);
		System.out.println("Add elements to the list (allways added at tail)");
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("JavaScript");
		System.out.println("Size of list is: " + list.size());
		System.out.println("Contents of list are : " + list);

	}

}
