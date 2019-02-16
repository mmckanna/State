
public class TrooperReadyState implements State {

	StormtrooperTrainingFacility trainingFacility;
	 
    public TrooperReadyState(StormtrooperTrainingFacility trainingFacility) {
        this.trainingFacility = trainingFacility;
    }
 
	public void requestTrooper() {
		System.out.println("Deploying requested Stormtrooper...");
	}
 
	public void deleteTrooperRequest() {
		System.out.println("Your request cannot be completed at this time.");
	}
 
	public void sendTrooperRequest() {
		System.out.println("Only one recruit can deploy at a time.");
	}
 
	public void deployTrooper() {
		
		trainingFacility.deployTrooper();
		if (trainingFacility.getCount() > 0) {
			trainingFacility.setState(trainingFacility.getTrooperOrderState());
		} else {
			System.out.println("We have ran out of Stormtroopers. We must recruit more.\n");
			trainingFacility.setState(trainingFacility.getNoTrooperState());
		}
	}
	
	public void noTrooperOrder() {
			
	}
	

	
	public void refill() {
		
	}
 
	public String toString() {
		return "has a few Stormtroopers ready.";
	}

}
