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
	
	for ( int i = 0, �� = scores.length; i < 1; i++) {
		System.out.printf("scores[%d] => %d\n", i, scores[i]);
	}
	System.out.println("��1.");
	int sum = 0;
	for (int i = 0; i< scores.length; i++) {
		sum += scores[i];
	}
	System.out.println("�迭�� �հ�:" +sum);
	System.out.println("��2");
	// �迭�ǿ���� 5���� ū���� �հ�
	
	
	for ( int i =0; i < scores.length; i++) {
		if( i >= 6 ) {
		sum += scores[i];
		}
	}
	System.out.println(i <6 );
	System.out.println("��3");
	// ¦����° ���� �հ�.
System.out.println("��4");

}
}