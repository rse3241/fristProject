package contol;

public class Parkyongho {

	public static void main(String[] args) {
		// if for (while) break, continue
		// 내가 알아서 문제 만듬
		// 주사위 던져서 50 나오면 이김
		int dice = (int) (Math.random()*100);
		System.out.println(dice);
		if (dice >= 51) {
			System.out.println("높음");
		}else if (dice <= 49 ) {
			System.out.println("낮음");
		}else if (dice == 50) {
			System.out.println("승리");
		}
		while(true) {
			dice = (int) (Math.random()*100);
			System.out.println(dice);
			if (dice >= 51) {
				System.out.println("높음");
			}else if (dice <= 49 ) {
				System.out.println("낮음");
			}else if (dice == 50) {
				System.out.println("승리");
			
			break;
				
		
			
			}
		}
		System.out.println("다시한번더");	

	}
}



