package co.yedam.enumerate;

public class PersonExample {

	public static void main(String[] args) {
	
			
		//������ �޼ҵ�.
	Week today =Week.FRI;
	Week[] Weeks= Week.values();
	for (Week Week: Weeks)
	System.out.println(Week.name());
	
	}
	
}

