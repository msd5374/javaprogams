package com.dac.exceptionhandling.customxception;

public class MainProgram {
	
	public static void main(String[] args) {
		
		StudentDatabase studentDatabase = new StudentDatabase();
		
		int id = 125;
		
		//Unhandled exception type StudentNotFoundException
		try {
			Student student = studentDatabase.getStudent(id);
			System.out.println("Stuent record found : "+student.getName());
		} catch (StudentNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}