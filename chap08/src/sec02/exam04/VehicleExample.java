package sec02.exam04;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		//Bus bus = new Bus();
		vehicle.run();
		//vehicle.checkFare(); 
		Bus bus = (Bus) vehicle; //강제 형변환
		
		bus.run();
		bus.checkFare();
	}

}
