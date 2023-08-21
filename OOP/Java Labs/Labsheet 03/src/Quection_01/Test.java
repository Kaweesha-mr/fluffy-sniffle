package Quection_01;

public class Test {
	
	public static void main(String[] args) {
		
		Student stu1 = new Student("yasho", "kadawatha", 54545);
		
		stu1.setName("kaweesa");
		stu1.setAddress("negambo");
		stu1.setDitNo(56565);
		
		
		System.out.println(stu1.getAddress());
		System.out.println(stu1.getDitNo());
		System.out.println(stu1.getName());
		
		System.out.println(stu1.getDetails());
	}

}
