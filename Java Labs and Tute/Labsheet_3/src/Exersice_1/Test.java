package Exersice_1;

public class Test {
	
	public static void main(String[] args) {
		Student s1 = new Student("kaweesha","kurunegala",1234568);
		Student s2 = new Student("hello","negambo",123565);
		
		s1.address = "kurunegala";
		s2.address = "negambo";
		s1.ditNo = 12345;
		s2.ditNo = 5564654;
		
		System.out.println(s1.address);
		System.out.println(s2.ditNo);
	}

}
