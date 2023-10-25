package qs1;

public class SatelliteCenter {
	
	int option;
	ISatellite iSatellite[];
	IGeoLocation iGeoLocation[];
	
	public SatelliteCenter(int option, ISatellite[] iSatellite, IGeoLocation[] iGeoLocation) {
		this.option = option;
		this.iSatellite = iSatellite;
		this.iGeoLocation = iGeoLocation;
	}
	
	public void startService() {
		
		if(option == 0) {
			
			iSatellite[0].activate();
			
			
		}
		else {
			
			iSatellite[1].activate();
			
		}
		
	}
	
	public void stopService() {
		
		if(option == 0) {
			
			iSatellite[0].deactivate();;
			
			
		}
		else {
			
			iSatellite[1].deactivate();;
			
		}
		
	}
	
	
	public void locationService() {
		
		if(option ==0) {
			iGeoLocation[0].displayLocation();


		}
		else {
			
			iGeoLocation[1].displayLocation();
			
		}
		
	}
	

}
