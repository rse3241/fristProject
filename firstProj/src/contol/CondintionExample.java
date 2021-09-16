package contol;

public class CondintionExample {

	public static void main(String[] args) {
		int score = 10;
		
		if(score >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다");
		}
		//90이상 a,80이상 b 70이상c 60이상d 그외f
		if(score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B"); }
		else if (score >= 70) {
			System.out.println("c");
		} else if (score >= 60) {
			System.out.println("D");
		} else
			System.out.println("f");
		System.out.println("끝");
		}
	}


