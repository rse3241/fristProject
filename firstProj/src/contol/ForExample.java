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
		System.out.printf("====�ٽ�===");
		cnt =0;
		for(int i=1; i<=5; i++ ) { //i=i+1 => i+=1;
			cnt += i;
			System.out.printf("i:%d,cnt: %d\n",i,cnt);
			
			System.out.printf("====�ٽ�1===");
			cnt =0;
			for(int a=1; i<=5; i++ ) { //i=i+1 => i+=1;
				cnt += i;
				System.out.printf("i:%d,cnt: %d\n",i,cnt);
				System.out.printf("====�ٽ�2===");
				int tempValue = (int) (Math.random() *10)+1;
				
					
					System.out.printf("%d��° ��:%d\n",i,tempValue);
			
			
		}
		System.out.printf("�ݺ�����.");
		}

}
}
