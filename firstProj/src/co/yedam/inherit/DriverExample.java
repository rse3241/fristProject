package co.yedam.inherit;
//
//bus -> vehicle , taxi -> vehicle
public class DriverExample {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		Taxi c = new Taxi();
		
		Driver driver =  new Driver();
		driver.drive(v); // vehicle <- bus, taxi
		

	}

}
