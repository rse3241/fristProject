package contol;

public class ConditionExe {

	public static void main(String[] args) {
		// 두정수 60,70
		// 두수를 합한 결과 100점 넘어서는지 100넘으면 합격 안넘으면 불합
		//끝.
		
		//두수를 곱해서 짝수면 짝수 홀수면 홀수
		//2번째 끝
		
		//복합대입연산자
		//4넣어서 2의배수입니다 라고 나오게하기
		//2의배수면 2의 배수 ,3의배수면 3배수 ,2와3의 공통배수
		int score = 60;
		int score1 = 70;
		
		if(score + score1 >=100){
		System.out.println("합격");
		}else  if (score + score1 <=100) {
			System.out.println("불합");
		}
		System.out.println("끝");
		if(score*score1%2==0){
			System.out.println("짝수");
		} else if (score*score1%2==1) {
			System.out.println("홀수");
		}System.out.println("2번째끝");
		
		int num = 12;
		if(num%2 ==0) {
			System.out.println("2의배수입니다");
		}  if (num%3 == 0) {
		System.out.println("3의배수입니다");
		} if (num%2==0 && num%3==0) {
		System.out.println("2와 3의배수입니다");
		}	
				
	}
}


