package co.yedam.inherit;

public class Vehicle {
	
	protected Vehicle() { //다른패키지 접근가능함 protected
		
	}
	public Vehicle(String msg) {
		System.out.println(">>");
	}
		protected void run() {
		System.out.println("자동차가 달립니다");

		}
	
	 protected void stop() {
		System.out.println("자동차가 달립니다");
	}
}