package reference;

public class MainExe {

	public static void main(String[] args) {
		// 1.학생수지정,2학생이름 입력3. 전체리스트 출력 4.종료
		String[] names = null;
		int [] scores= null;
		showmenu();
				while (true) {
					int choice = readint("번호입력");
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
				System.out.println("종료");

	public static void showmenu() {
		System.out.println("1학생인원,2학생이름,3전체리스트,4종료");
	}

	public static void ceratstudent() {
				int cnt = readint("학생수입력");
				return cnt;
	}

	public static void  showlist(String[]) {
					String =name("이름입력");
				}
				public static void list(ary) {
					for (int i = 0; i < ary.length; i++) {
						System.out.printf("scores[%d => %d\n", i, ary[i]);
					
				}
				}
}
