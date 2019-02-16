public class NoTrooperOrderState implements State {
	
	StormtrooperTrainingFacility trainingFacility;
 
    public NoTrooperOrderState(StormtrooperTrainingFacility trainingFacility) {
        this.trainingFacility = trainingFacility;
    }
 
	public void requestTrooper() {
		System.out.println("You have requested a Stormtrooper.");
		trainingFacility.setState(trainingFacility.getTrooperReadyState());
	}
 
	public void deleteTrooperRequest() {
		System.out.println("You have placed an order for a new Stormtrooper.");
	}
 
	public void sendTrooperRequest() {
		System.out.println("You have not fully requested the new Stormtrooper");
	 }
 
	public void deployTrooper() {
		System.out.println("You must place an order for a Stormtrooper\n");
	}
	
	public void noTrooperOrder() {
		System.out.println("No order was placed");
		
	}
	
	public void refill() { }
 
	public String toString() {
		return "is waiting for orders.";
	}

	
}