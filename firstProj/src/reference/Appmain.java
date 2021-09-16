package reference;

import java.util.Scanner;

public class Appmain {

	public static void main(String[] args) {
		// �л������� ���� ���� �м�
		// �л��ο� ���� , �л� ���� , ��ü ����Ʈ , �м�:���, �ְ��� ,����
		 
		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readint("��ȣ�Է�");

			if (choice == 1) {

				int size = createStudent();

				scores = new int[size];
			} else if (choice == 2) {
				inputvalue(scores);
			} else if (choice == 3) {
				showList(scores);


			} else if (choice == 4) {
				analysis(scores);
			} else if (choice == 5) {
				break;
			}

		}
		System.out.println("��");
		
	}

	public static void showMenu() {
		System.out.println("1:�л��ο� ���� , 2:�л� �����Է� , 3:��ü ����Ʈ , 4:�м�:���,�ְ��� ,5:����");
	}

	public static int createStudent() {
		int cnt = readint("�л����Է�");
		return cnt;
	}

	public static void inputvalue(int[] ary) {
		 
			
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readint("�л������� �Է��ϼ���");
		}
	}

	public static void showList(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("scores[%d => %d\n", i, ary[i]);
		}
	}

	public static void analysis(int[] ary) {
		// ���,�ְ��� => �ܼ�
		int sum =0 ;
		int avg =0 ;
		int max = 0;
		for (int i=0; i < ary.length; i++) {
			sum+= ary[i];
			if(max < ary[i]) {
				max= ary[i];
			}
		}
		
		avg= sum/3;
		System.out.printf("���: %d, �ְ���:%d",avg ,max);
	}

	public static int readint(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}

}
