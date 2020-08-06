package com.dac.exceptionhandling.customxception;

public class StudentDatabase {
	
	private Student[] students = new Student[3];
	
	public StudentDatabase() {
		loadDatabse();
	}
	
	private void loadDatabse() {
		Student student1 = new Student("Shivam", 121, "112233");
		Student student2 = new Student("Aakash", 122, "223344");
		Student student3 = new Student("Atul", 123, "556677");
		
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
	}
	
	public Student getStudent(int id) throws StudentNotFoundException{
		for(int i=0;i<students.length;i++) {
			if( id == students[i].getId())
				return students[i];
			else 
				continue;
		}
		//at this place student record is not found
		throw new StudentNotFoundException();
	}
	
	

}
