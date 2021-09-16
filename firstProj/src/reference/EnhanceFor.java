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
 		System.out.println("=====다시====");
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
 		System.out.println("학생합계"+sum1);
 		System.out.println(sum1/b.length);
 		
 		
 		
 		
 		//학생 3명 4.2 3.5 2.8 배열선언
 		//합계를 담을수있도록 변수
 		//평균을 계산해서 avg
 		//학생 편균:3.15?? 입니다
	}
}
