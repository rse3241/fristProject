package co.yedam.inherit;

public class Vehicle {
	
	protected Vehicle() { //�ٸ���Ű�� ���ٰ����� protected
		
	}
	public Vehicle(String msg) {
		System.out.println(">>");
	}
		protected void run() {
		System.out.println("�ڵ����� �޸��ϴ�");

		}
	
	 protected void stop() {
		System.out.println("�ڵ����� �޸��ϴ�");
	}
}