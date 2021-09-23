package co.yedam.account; //패키지는 폴더다

import java.util.Scanner;

public class AppMain {//
// 싱글톤: new 생성자 => 새로운 인스턴스.
private static AppMain singLeton =new AppMain();
//static 선언하면 필드에 여러인스턴스  못만듬 메모리할당 줄임
	// 생성자 private
	private AppMain () {
		
	}

	//method getInstance
	public static AppMain getInstance() {
		return singLeton;
	}
	
private static void createAccount() {
	
}


private static void accountList() {
	
}


private static void deposit() {
			
}


private static void withdraw() {
	
}


private static AppEX findAccount(String ano) {
	return null;
	
	}
private boolean run;
public void execute() {
	Scanner scanner = new Scanner(System.in);

	System.out.println("----------------");
	System.out.println("1.계좌생성2.계좌목록3.예금4.출금5.종료");
	System.out.println("----------------");
	System.out.println("선택>>>");
	
	int selectNo = scanner.nextInt();

	if (selectNo == 1) {
		createAccount();
	} else if (selectNo == 2) {
		accountList();
	} else if (selectNo == 3) {
		deposit();
	} else if (selectNo == 4) {
		withdraw();
	} else if (selectNo == 5) {
		run = false;
	}	
}
}
