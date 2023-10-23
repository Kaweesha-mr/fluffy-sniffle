package quection1;

public class sensorDemo {

	public static void main(String[] args) {
		
		ISensor humiditySensor = new HumiditySensor("Humidity");
		IMotionTracker humidityTracker = new SensorLocation("colombo");
		ISensor rainFallSensor = new RainFallSensor("RainFall");
		IMotionTracker rainFallTracker = new SensorLocation("kandy");
		
		ISensor[] sensorArray = new ISensor[] {humiditySensor,rainFallSensor};
		IMotionTracker[] trackerArray = new IMotionTracker[] {humidityTracker,rainFallTracker};
		
		RemoteController remoteController = new RemoteController(0, sensorArray, trackerArray);
		remoteController.startService();
		remoteController.stopService();
		remoteController.locationService();
		
		RemoteController remoteController2 = new RemoteController(1, sensorArray, trackerArray);
		remoteController2.startService();
		remoteController2.stopService();
		remoteController2.locationService();
	}

}
