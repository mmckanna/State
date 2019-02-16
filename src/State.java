
public interface State {
	
	public void requestTrooper();
	public void deleteTrooperRequest();
	public void sendTrooperRequest();
	public void deployTrooper();
	public void noTrooperOrder();
	
	public void refill();
	
}