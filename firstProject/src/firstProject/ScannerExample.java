package firstProject;
import java.util.Scanner;
public class ScannerExample {
	public static void main (String[] args) {
         //변수: 사용자 입력(10,20)
		//10 + 20 = 30
		Scanner scn = new Scanner(System.in);
		int number = 10;
		int number1 = 20;
		System.out.println("10을 입력하세요");
		number =scn.nextInt();
		
		System.out.println("20을 입력하세요");
		number1 =scn.nextInt();
		System.out.println("나온 결과값을 더합니다");
		System.out.println(number + number1);
		
}
}
