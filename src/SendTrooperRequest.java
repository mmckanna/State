
public class SendTrooperRequest implements State {
	
	StormtrooperTrainingFacility trainingFacility;
	 
	public SendTrooperRequest(StormtrooperTrainingFacility trainingFacility) {
		this.trainingFacility = trainingFacility;
	}
  
	public void requestTrooper() {
		System.out.println("There are no Stormtroopers. Lets recruit some.");
	}
 
	public void deleteTrooperRequest() {
		System.out.println("Stormtrooper request has been deleted");
		trainingFacility.setState(trainingFacility.getNoTrooperState());
	}
 
	public void sendTrooperRequest() {
		System.out.println("You requested...");
		trainingFacility.setState(trainingFacility.getTrooperReadyState());
	}

    public void deployTrooper() {
        System.out.println("No Stormtrooper deployed");
    }
    
    public void noTrooperOrder() {
		System.out.println("No order was placed");
		
	}
    
    public void refill() {
    	
    }
 
	public String toString() {
		return "waiting for a request.";
	}


}
