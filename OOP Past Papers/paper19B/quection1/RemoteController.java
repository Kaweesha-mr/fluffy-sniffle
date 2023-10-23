package quection1;

public class RemoteController {
	int Switch;
	ISensor iSensor[];
	IMotionTracker iMotionTracker[];
	
	public RemoteController(int switch1, ISensor[] iSensor, IMotionTracker[] iMotionTracker) {
		super();
		Switch = switch1;
		this.iSensor = iSensor;
		this.iMotionTracker = iMotionTracker;
	}
	
	
	public void startService() {
		for(ISensor r : iSensor) {
			
			if(Switch ==0) {
				r.off();
			}
			else if (Switch ==1) {
				r.on();	
			}
		}
		
	}
	
	public void stopService() {
		for(ISensor r : iSensor) {
				
			r.off();
			}
		}
		
	public void locationService() {
		
		for(IMotionTracker i: iMotionTracker) {
			i.displayLocation();
		}
		
	}
	
	

}
