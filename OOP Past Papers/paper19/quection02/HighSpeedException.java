package quection02;

public class HighSpeedException extends Exception
{
	
	private final String HIGH_SPEED = "High Speed";
	private final String Normal_SPEED = "Normal Speed";
	private final String TWO_SlOW = "Two Slow";
	
	public HighSpeedException(float speed) {
		
		
		if(speed>=100) {
			System.out.println(HIGH_SPEED+"\n");
		}
		else if(speed<=100 && speed >= 50) {
			System.out.println(Normal_SPEED);
		}
		else {
			System.out.println(TWO_SlOW+"\n");
		}	

	}
}



