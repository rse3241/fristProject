package reference;

public class MethodExample111111 {

	public static void main(String[] args) {
		sum(24,55); //�޼ҵ� ����
		int a= 45, b= 77;
		sum(a,b);
		multi(50,87);
		getArea(3.5);
		int res = getMax(a,b);
		System.out.println("ū����:"+res);
		double tr = divide(5,3);
		System.out.println("��������:"+tr);
		
	}
	// �������� �Է¹޾Ƽ� �μ��� ���� console �����ִ°���
	public static void sum(int n1, int n2) {
		int sum = n1+ n2;
		System.out.println("�μ�����:"+sum);
	}
	
	
	//�������� �Է� �޾Ƽ� �μ��� ����  �ֿܼ� ��Ÿ����
	
	
	public static void multi(int i1 ,int i2) {
		int multi = i1*i2;
		System.out.println("�μ��ǰ�"+multi);
	}
	
	public static void getArea(double side) { 
	double  getArea = side*side;
	System.out.println("���簢�� �ʺ�"+getArea);
	
}
	//�μ��߿��� ū���� ��ȯ���ִ� �޼ҵ� 
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1:num2;
			return result;
				}
	
	// �������� �Է� �޾Ƽ�  ù��° ��/ �ι�° ���� ���.
	public static double divide(double a , double b) {
		double tr = (a/b);
		return tr;
	}
}