package reference;

public class MainExe {

	public static void main(String[] args) {
		// 1.�л�������,2�л��̸� �Է�3. ��ü����Ʈ ��� 4.����
		String[] names = null;
		int [] scores= null;
		showmenu();
				while (true) {
					int choice = readint("��ȣ�Է�");
					if (choice==1) {
						int size = ceratstudent();
						scores = new int[size];
						
					}else if (choice == 2); {
						input(scores);
					
					}else if (choice ==3) {
						=showlist(names);
					}else if (choice==4) {
						int list = (ary);
		}
					else if (choice==5) {
						break;
}
	}		
				System.out.println("����");

	public static void showmenu() {
		System.out.println("1�л��ο�,2�л��̸�,3��ü����Ʈ,4����");
	}

	public static void ceratstudent() {
				int cnt = readint("�л����Է�");
				return cnt;
	}

	public static void  showlist(String[]) {
					String =name("�̸��Է�");
				}
				public static void list(ary) {
					for (int i = 0; i < ary.length; i++) {
						System.out.printf("scores[%d => %d\n", i, ary[i]);
					
				}
				}
}
