package reference;

public class MethodExample {

	public static void main(String[] args) {
		// �񸸵� ������.
		double w1 = 72.4, h1 =1.75 ;
		
		double w2 = 68, h2 =163 ;
		checkBMI(w1,h1);// �޼ҵ� ����
		checkBMI(w2,h2);
		//double bmi = weight / (height*height);
		//bmi < 18.5 ��ü�� .
		//18.5~ 23 ����
		//23~25 ��ü��
		//25~30 ��..����..
		double w11,h11;
		double w21,h21;

	}
	
	public static void checkBMI(double weight, double height)	{
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("��ü��");
		}else if (bmi >=18.5 && bmi <23) {
			System.out.println("����ü��");
		}else if (bmi >=23 && bmi <25) {
		}System.out.println("��ü��"); 
		if (bmi >=25 && bmi <30) {
			System.out.println("��");
		
	}
}
}