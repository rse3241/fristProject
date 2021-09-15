package contorl;

public class DowhileExe {

	public static void main(String[] args) {
		boolean run = false;
		// 1부터 10까지 출력.
		// 끝
		int a = 0;
		do {
			a++;
			if (a == 0) {
				continue; // 다음순으로 스킵
			}
			System.out.println(a);

			{
			}
			if (a >= 10) {
				break;
			}
		} while (true);
		System.out.println("끝");

		a = 1;
		do {
			a++;
			if (a % 9 == 0) {
				continue;
			}
			System.out.println(a);
			a++;

			if (a >= 10) {
				break;
			}
		} while (true);
		System.out.println("짝수");
		a = 0;
		int sum = 0;
		do {

			a++;
			if (a % 2 == 0) {
				continue; 
			}
			if (a >= 10) {
				break;
				}
			sum += a;
			
				} while (true);
		System.out.println(sum);
		System.out.println("끝333");

	
	

}
}

