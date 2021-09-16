package reference;

public class MethodExample {

	public static void main(String[] args) {
		// 비만도 계산공식.
		double w1 = 72.4, h1 =1.75 ;
		
		double w2 = 68, h2 =163 ;
		checkBMI(w1,h1);// 메소드 실행
		checkBMI(w2,h2);
		//double bmi = weight / (height*height);
		//bmi < 18.5 저체중 .
		//18.5~ 23 정상
		//23~25 과체중
		//25~30 비만..고도비만..
		double w11,h11;
		double w21,h21;

	}
	
	public static void checkBMI(double weight, double height)	{
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("저체중");
		}else if (bmi >=18.5 && bmi <23) {
			System.out.println("적정체중");
		}else if (bmi >=23 && bmi <25) {
		}System.out.println("과체중"); 
		if (bmi >=25 && bmi <30) {
			System.out.println("비만");
		
	}
}
}