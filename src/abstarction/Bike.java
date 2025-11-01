package abstarction;

public class Bike implements Vehicle {

	@Override
	public void start() {
		System.out.println("Bike Started");
		
	}

	@Override
	public Engine getEngine() {
		// TODO Auto-generated method stub
		return new BikeEngine();
	}

}
