package firstProject;
import java.util.Scanner;
public class ScannerExample {
	public static void main (String[] args) {
         //����: ����� �Է�(10,20)
		//10 + 20 = 30
		Scanner scn = new Scanner(System.in);
		int number = 10;
		int number1 = 20;
		System.out.println("10�� �Է��ϼ���");
		number =scn.nextInt();
		
		System.out.println("20�� �Է��ϼ���");
		number1 =scn.nextInt();
		System.out.println("���� ������� ���մϴ�");
		System.out.println(number + number1);
		
}
}
