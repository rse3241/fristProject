package reference;

public class EnhanceFor {

	public static void main(String[] args) {
		String[] strAry = null;
		String[] strAry1 = new String[5];// null,null,null,null,null,
		strAry = new String[] {"hong", "park","kim","hwang"};
 		System.out.println(strAry.length);
 		
 		strAry[3] = "hwang";
 				for (int i = 0; i < strAry.length; i++) {
 					if(strAry[i].equals("hong"))
 						System.out.println(strAry[i]);
	}
 		System.out.println("=====�ٽ�====");
 		for(String name : strAry) {
 			System.out.println(name);
 		}
 		int[] scores = {50,70,80,60};
 		int sum =0;
 		for (int score : scores) {
 			sum += score;
 		}
 				
 		
 		double [] b = {4.2 ,3.5,2.8};
 		
 		double sum1 = 0;
 		for ( double a : b  ) {
 			sum1 += a;
 		}
 		System.out.println("�л��հ�"+sum1);
 		System.out.println(sum1/b.length);
 		
 		
 		
 		
 		//�л� 3�� 4.2 3.5 2.8 �迭����
 		//�հ踦 �������ֵ��� ����
 		//����� ����ؼ� avg
 		//�л� ���:3.15?? �Դϴ�
	}
}
