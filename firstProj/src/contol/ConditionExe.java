package contol;

public class ConditionExe {

	public static void main(String[] args) {
		// ������ 60,70
		// �μ��� ���� ��� 100�� �Ѿ���� 100������ �հ� �ȳ����� ����
		//��.
		
		//�μ��� ���ؼ� ¦���� ¦�� Ȧ���� Ȧ��
		//2��° ��
		
		//���մ��Կ�����
		//4�־ 2�ǹ���Դϴ� ��� �������ϱ�
		//2�ǹ���� 2�� ��� ,3�ǹ���� 3��� ,2��3�� ������
		int score = 60;
		int score1 = 70;
		
		if(score + score1 >=100){
		System.out.println("�հ�");
		}else  if (score + score1 <=100) {
			System.out.println("����");
		}
		System.out.println("��");
		if(score*score1%2==0){
			System.out.println("¦��");
		} else if (score*score1%2==1) {
			System.out.println("Ȧ��");
		}System.out.println("2��°��");
		
		int num = 12;
		if(num%2 ==0) {
			System.out.println("2�ǹ���Դϴ�");
		}  if (num%3 == 0) {
		System.out.println("3�ǹ���Դϴ�");
		} if (num%2==0 && num%3==0) {
		System.out.println("2�� 3�ǹ���Դϴ�");
		}	
				
	}
}


