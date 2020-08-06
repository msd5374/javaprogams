package com.dac.collectinos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {

		ArrayList<String> countryList = new ArrayList<>();
		
		countryList.add("India");
		countryList.add("China");
		countryList.add("Pakistan");
		countryList.add("US");
		
		int size = countryList.size();
		System.out.println("Size of the list is : "+size);
		
		boolean emptyState = countryList.isEmpty();
		System.out.println("Is empty :: "+emptyState);
		
		//countryList.clear();
		emptyState = countryList.isEmpty();
		System.out.println("Is empty :: "+emptyState);
		
		countryList.add("US");
		countryList.add("India");
		size = countryList.size();
		System.out.println("Size of the list is : "+size);
		
		Iterator<String> iterator = countryList.iterator();
		System.out.println("All elements in the list");
		while(iterator.hasNext()) {
			String country = iterator.next();
			System.out.println(country);
		}
		
		
		
		System.out.println("End of the program.");
	}

}