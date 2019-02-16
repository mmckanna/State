
public class StormtrooperTrainingFacility {
	
	State trooperReadyState;
	State noTrooperReadyState;
	State sendTrooperRequestState;
	
	State noTrooperOrderState;
 
	State state;
	int count = 0;
 
	public StormtrooperTrainingFacility(int stormtroopersReady) {
		trooperReadyState = new TrooperReadyState(this);
		noTrooperReadyState = new NoTrooperReadyState(this);
		sendTrooperRequestState = new SendTrooperRequest(this);
		noTrooperOrderState = new NoTrooperOrderState(this);

		this.count = stormtroopersReady;
 		if (stormtroopersReady > 0) {
			state = noTrooperOrderState;
		} else {
			state = noTrooperReadyState;
		}
	}
 
	public void requestTrooper() {
		state.requestTrooper();
	}
 
	public void deleteTrooperRequest() {
		state.deleteTrooperRequest();
	}
 
	public void sendTrooperRequest() {
		state.sendTrooperRequest();
		state.deployTrooper();
	}
 
	void deployTrooper() {
		System.out.println("Stormtrooper is ready...\n");
		if (count != 0) {
			count = count - 1;
		}	
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("Total number of recruits: " + this.count + "\n");
		state.refill();
	}

	void setState(State state) {
		this.state = state;
	}
    public State getState() {
        return state;
    }

    public State getTrooperReadyState() {
        return trooperReadyState;
    }

    public State getNoTrooperState() {
        return noTrooperReadyState;
    }

    public State getTrooperRequest() {
        return sendTrooperRequestState;
    }

    
    
    public State getTrooperOrderState() {
    	return noTrooperOrderState;
    }
    
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nRecruits: " + count + " Stormtrooper");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("The training facility " + state + "\n");
		return result.toString();
	}

}
