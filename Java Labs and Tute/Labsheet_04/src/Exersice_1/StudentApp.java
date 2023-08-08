package Exersice_1;

public class StudentApp {

	public static void main(String[] args) {
		
	Student[] students = new Student[5];
	
	students[0] = new Student("kaweesha", "ict", "0716479128");
	students[1] = new Student("yashodha", "ICT", "077072327333");
	students[2] = new Student("John Doe", "Computer Science", "123-456-7890");
    students[3] = new Student("Jane Smith", "Engineering", "987-654-3210");
    students[4] = new Student("Alice Johnson", "Mathematics", "555-123-4567");

    
    
    for(Student s1:students) {
    	s1.print();
    	System.out.println("\n");
    }

	}

}
