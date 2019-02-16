
public class NoTrooperReadyState implements State {

	StormtrooperTrainingFacility trainingFacility;
	 
    public NoTrooperReadyState(StormtrooperTrainingFacility trainingFacility) {
        this.trainingFacility = trainingFacility;
    }
 
	public void requestTrooper() {
		System.out.println("There are no Stormtroopers.");
	}
 
	public void deleteTrooperRequest() {
		System.out.println("You haven't tried to recruit.");
	}
 
	public void sendTrooperRequest() {
		System.out.println("You attempted to deploy a Stormtrooper, but there are none!");
	}
 
	public void deployTrooper() {
		System.out.println("No Stormtrooper deployed\n");
	}
	
	public void noTrooperOrder() {
		System.out.println("No order was placed");
		
	}	
	 
	public String toString() {
		return "is out of recruits\n";
	}

	public void refill() {
		trainingFacility.setState(trainingFacility.getNoTrooperState());
	}

}
