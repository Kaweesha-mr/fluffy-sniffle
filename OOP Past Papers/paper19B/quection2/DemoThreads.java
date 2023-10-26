package quection2;

public class DemoThreads {
	
	public static void main(String[] args) {
		
		DemoThreads demoThreads = new DemoThreads();
		
		
		Thread addNumberss = new Thread(new AddNumbers(demoThreads, 10, 20),"ADD");
		Thread multiplyNumberss = new Thread(new MultiplyNumbers(demoThreads, 10, 20),"MUL");
		
		addNumberss.start();
		multiplyNumberss.start();
	
	}

}
