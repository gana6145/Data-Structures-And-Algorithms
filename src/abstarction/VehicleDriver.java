package abstarction;

public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle v= new Bike();
		v.start();
		Engine e=v.getEngine();
		e.startEngine();

	}

}
