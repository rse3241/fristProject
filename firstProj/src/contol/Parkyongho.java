package contol;

public class Parkyongho {

	public static void main(String[] args) {
		// if for (while) break, continue
		// ���� �˾Ƽ� ���� ����
		// �ֻ��� ������ 50 ������ �̱�
		int dice = (int) (Math.random()*100);
		System.out.println(dice);
		if (dice >= 51) {
			System.out.println("����");
		}else if (dice <= 49 ) {
			System.out.println("����");
		}else if (dice == 50) {
			System.out.println("�¸�");
		}
		while(true) {
			dice = (int) (Math.random()*100);
			System.out.println(dice);
			if (dice >= 51) {
				System.out.println("����");
			}else if (dice <= 49 ) {
				System.out.println("����");
			}else if (dice == 50) {
				System.out.println("�¸�");
			
			break;
				
		
			
			}
		}
		System.out.println("�ٽ��ѹ���");	

	}
}



