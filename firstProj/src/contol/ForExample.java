package contorl;

public class ForExample {

	public static void main(String[] args) {
		int cnt =0;
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		cnt += 1;
		System.out.printf("cnt: %d\n", cnt);
		System.out.printf("====다시===");
		cnt =0;
		for(int i=1; i<=5; i++ ) { //i=i+1 => i+=1;
			cnt += i;
			System.out.printf("i:%d,cnt: %d\n",i,cnt);
			
			System.out.printf("====다시1===");
			cnt =0;
			for(int a=1; i<=5; i++ ) { //i=i+1 => i+=1;
				cnt += i;
				System.out.printf("i:%d,cnt: %d\n",i,cnt);
				System.out.printf("====다시2===");
				int tempValue = (int) (Math.random() *10)+1;
				
					
					System.out.printf("%d번째 값:%d\n",i,tempValue);
			
			
		}
		System.out.printf("반복문끝.");
		}

}
}
