package contol;

public class CondintionExample {

	public static void main(String[] args) {
		int score = 10;
		
		if(score >= 60) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�");
		}
		//90�̻� a,80�̻� b 70�̻�c 60�̻�d �׿�f
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
		System.out.println("��");
		}
	}


