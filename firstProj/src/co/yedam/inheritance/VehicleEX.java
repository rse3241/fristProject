package co.yedam.inheritance;

import co.yedam.inherit.Vehicle;

public class VehicleEX extends Vehicle {
	public VehicleEX () {
		super();
	}
	
	protected void run() {
		 System.out.println("������ �޸��ϴ�");
	}

	public void stop() {
		super.stop();
	}
	

}
