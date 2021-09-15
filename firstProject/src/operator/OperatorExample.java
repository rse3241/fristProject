package operator;

public class OperatorExample {
	public static void main(String[] args) {
		//+,-,*,/,%, &, | ,^, ~
		int num1,num2, result;
		num1 = 10;
		num2 =  5;
//		result = num2 = num1;
		
		result = num1 * num2; //할당(대입)연산자 = 
		
		result = -result;
		System.out.printf("-연산결과: %d\n", result);
		result = num1 % 3;
		System.out.printf("연산결과: %d\n", result);
		result = num1 % num2;
		System.out.printf("연산결과: %d\n", result);
	}
}