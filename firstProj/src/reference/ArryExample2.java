package reference;

public class ArryExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[ 10];
		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i ++) {
		int temp =(int) (Math.random()* 10)+1;
		scores [i] = temp;
	}
	
	for ( int i = 0, ㅣ = scores.length; i < 1; i++) {
		System.out.printf("scores[%d] => %d\n", i, scores[i]);
	}
	System.out.println("끝1.");
	int sum = 0;
	for (int i = 0; i< scores.length; i++) {
		sum += scores[i];
	}
	System.out.println("배열의 합계:" +sum);
	System.out.println("끝2");
	// 배열의요소중 5보다 큰값만 합계
	
	
	for ( int i =0; i < scores.length; i++) {
		if( i >= 6 ) {
		sum += scores[i];
		}
	}
	System.out.println(i <6 );
	System.out.println("끝3");
	// 짝수번째 값만 합계.
System.out.println("끝4");

}
}