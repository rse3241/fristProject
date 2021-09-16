package reference;

import java.util.Scanner;

public class Appmain {

	public static void main(String[] args) {
		// 학생정보를 생성 점수 분석
		// 학생인원 지정 , 학생 점수 , 전체 리스트 , 분석:평균, 최고점 ,종료
		 
		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readint("번호입력");

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
		System.out.println("끝");
		
	}

	public static void showMenu() {
		System.out.println("1:학생인원 지정 , 2:학생 점수입력 , 3:전체 리스트 , 4:분석:평균,최고점 ,5:종료");
	}

	public static int createStudent() {
		int cnt = readint("학생수입력");
		return cnt;
	}

	public static void inputvalue(int[] ary) {
		 
			
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readint("학생점수를 입력하세요");
		}
	}

	public static void showList(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("scores[%d => %d\n", i, ary[i]);
		}
	}

	public static void analysis(int[] ary) {
		// 평균,최고점 => 콘솔
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
		System.out.printf("평균: %d, 최고점:%d",avg ,max);
	}

	public static int readint(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;
	}

}
