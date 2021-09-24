package co.yedam.enumerate;

public class PersonExample {

	public static void main(String[] args) {
	
			
		//열거형 메소드.
	Week today =Week.FRI;
	Week[] Weeks= Week.values();
	for (Week Week: Weeks)
	System.out.println(Week.name());
	
	}
	
}

