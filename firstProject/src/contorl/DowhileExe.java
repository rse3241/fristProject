package contorl;

public class DowhileExe {

	public static void main(String[] args) {
		boolean run = false;
		// 1���� 10���� ���.
		// ��
		int a = 0;
		do {
			a++;
			if (a == 0) {
				continue; // ���������� ��ŵ
			}
			System.out.println(a);

			{
			}
			if (a >= 10) {
				break;
			}
		} while (true);
		System.out.println("��");

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
		System.out.println("¦��");
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
		System.out.println("��333");

	
	

}
}

