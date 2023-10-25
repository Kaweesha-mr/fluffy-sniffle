package qs1;

public class SatelliteDemo {

	public static void main(String[] args) {
		
		
		ISatellite navigationalISatellite = new NavigationSatellite("Ravana-01");
		IGeoLocation locationTracker1 = new SatelliteLocation("Sri Lanka");
		ISatellite droneISatellite = new DroneSatellite("Ravana-2");
		IGeoLocation locationTracker2 = new SatelliteLocation("Russia");
		
		ISatellite [] satelliteArray = new ISatellite[] {navigationalISatellite,droneISatellite};
		IGeoLocation[] trackerArray = new IGeoLocation[] {locationTracker1,locationTracker2};

		SatelliteCenter satelliteCenter = new SatelliteCenter(0,satelliteArray,trackerArray);
		satelliteCenter.startService();
		satelliteCenter.stopService();
		satelliteCenter.locationService();
		
		SatelliteCenter remoteController2 = new SatelliteCenter(0,satelliteArray,trackerArray);
		remoteController2.startService();
		remoteController2.stopService();
		remoteController2.locationService();
		
	}
}
		
		
		
		
		
