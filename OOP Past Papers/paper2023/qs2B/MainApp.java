package qs2B;

public class MainApp {
	

	

	public static void main(String[] args) {
		
		Pair<String, Integer> pair1 = new Pair<String, Integer>("Test 1", 42);
		Pair<Double, String> pair2 = new Pair<Double, String>(3.14, "Test 2");
		
		System.out.println("Printing First Pair");
		System.out.println("First Value" + pair1.getFirst());
		System.out.println("Second value :" + pair1.getSecond());
		
		
		System.out.println();
		
		System.out.println("Printing First Pair");
		System.out.println("First Value" + pair2.getFirst());
		System.out.println("Second value :" + pair2.getSecond());
		
	}
}
