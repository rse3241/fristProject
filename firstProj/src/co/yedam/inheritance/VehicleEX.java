package co.yedam.inheritance;

import co.yedam.inherit.Vehicle;

public class VehicleEX extends Vehicle {
	public VehicleEX () {
		super();
	}
	
	protected void run() {
		 System.out.println("버스가 달립니다");
	}

	public void stop() {
		super.stop();
	}
	

}
