package co.yedam.account; //��Ű���� ������

import java.util.Scanner;

public class AppMain {//
// �̱���: new ������ => ���ο� �ν��Ͻ�.
private static AppMain singLeton =new AppMain();
//static �����ϸ� �ʵ忡 �����ν��Ͻ�  ������ �޸��Ҵ� ����
	// ������ private
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
	System.out.println("1.���»���2.���¸��3.����4.���5.����");
	System.out.println("----------------");
	System.out.println("����>>>");
	
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
