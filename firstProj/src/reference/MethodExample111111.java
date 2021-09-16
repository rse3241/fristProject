package reference;

public class MethodExample111111 {

	public static void main(String[] args) {
		sum(24,55); //메소드 실행
		int a= 45, b= 77;
		sum(a,b);
		multi(50,87);
		getArea(3.5);
		int res = getMax(a,b);
		System.out.println("큰수는:"+res);
		double tr = divide(5,3);
		System.out.println("나눈값은:"+tr);
		
	}
	// 두정수르 입력받아서 두수의 합을 console 보여주는거임
	public static void sum(int n1, int n2) {
		int sum = n1+ n2;
		System.out.println("두수의합:"+sum);
	}
	
	
	//두정수를 입력 받아서 두수의 곱을  콘솔에 나타나셈
	
	
	public static void multi(int i1 ,int i2) {
		int multi = i1*i2;
		System.out.println("두수의곱"+multi);
	}
	
	public static void getArea(double side) { 
	double  getArea = side*side;
	System.out.println("정사각형 너비"+getArea);
	
}
	//두수중에서 큰값을 반환해주는 메소드 
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1:num2;
			return result;
				}
	
	// 두정수를 입력 받아서  첫번째 값/ 두번째 나눈 결과.
	public static double divide(double a , double b) {
		double tr = (a/b);
		return tr;
	}
}