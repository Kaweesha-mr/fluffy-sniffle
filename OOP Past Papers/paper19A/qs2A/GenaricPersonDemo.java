package qs2A;

import java.util.ArrayList;

public class GenaricPersonDemo {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("STD1111", 6));
		students.add(new Student("STD1112", 7));
		students.add(new Student("STD1113", 12));
		students.add(new Student("STD1114", 11));
		students.add(new Student("STD1115", 10));
	
		
		ArrayList<Lecturer>Lectures = new ArrayList<>();
		Lectures.add(new Lecturer("EMP1111","IT"));
		Lectures.add(new Lecturer("EMP1112", "IT"));
		Lectures.add(new Lecturer("EMP1113", "business"));
		Lectures.add(new Lecturer("EMP1114", "IT"));
		Lectures.add(new Lecturer("EMP1115", "IT"));
		
		
		GenaricPerson genaricPerson = new GenaricPerson();
		genaricPerson.displayElements(Lectures);
		
		
		System.out.println();
		genaricPerson.displayElements(students);
	}
	
	
	
}
