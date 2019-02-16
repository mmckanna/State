import org.junit.jupiter.api.Test;

class StateTestCases {

	@Test
	void test() {
		
			StormtrooperTrainingFacility trainingFacility = new StormtrooperTrainingFacility(2);

			System.out.println(trainingFacility);

			trainingFacility.requestTrooper();
			trainingFacility.sendTrooperRequest();
			trainingFacility.requestTrooper();
			trainingFacility.sendTrooperRequest();
			
			
			trainingFacility.refill(5);
			
			trainingFacility.requestTrooper();
			trainingFacility.sendTrooperRequest();
			
			System.out.println(trainingFacility);
						
		
			
		}
	}
