package contorl;

public class Rnadom {

	public static void main(String[] args) {
		int randomValue = (int) (Math.random() * 6) + 1;
		System.out.println(randomValue);
		// switch 조건문 --- 1나옴
		// 4번끝
		switch (randomValue) {
		case 1:
			System.out.println("축");
			break;
		case 2:
			System.out.println("꽝");
			break;
		case 3:
			System.out.println("x");
			break;
		case 4:
			System.out.println("x");
			break;
		case 5:
			System.out.println("x");
			break;
		case 6:
			System.out.println("x");
			break;
		case 7:
			System.out.println("x");
		}
		System.out.println("4번째끝");

		int randomnumber = (int) (Math.random() * 100);
		System.out.println(randomnumber);
		if (randomnumber >= 90) {
			System.out.println("A");
		} else if (randomnumber >= 80) {
			System.out.println("B");
		} else if (randomnumber >= 70) {
			System.out.println("c");
		} else if (randomnumber >= 60) {
			System.out.println("D");
		} else
			System.out.println("f");
		System.out.println("5번째끝");
	}

}
