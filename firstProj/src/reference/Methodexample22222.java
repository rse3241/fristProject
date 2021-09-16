package reference;

public class Methodexample22222 {

	public static void main(String[] args) {
		int [] scores = {88,67,92,73,58};
		int maxval = 0 ;
		boolean isTrue =false;
		for(int i=0; i<scores.length; i++) {
		isTrue =maxval < scores[i];
			if(isTrue) {
			maxval = scores[i];
			}
		
		System.out.println("최대값:"+maxval);
		if(isTrue) {
			maxval = scores[1];
			System.out.println(maxval);
			if(isTrue) {
				maxval = scores[2];
			}
			System.out.println(maxval);
			if(isTrue) {
				maxval = scores[3];
			}
			System.out.println(maxval);
		
		System.out.println("끝1");
		int[] anotherary = {55,82,34,19,47,89};
		System.out.println("끝2");
		}}
		}
public static int getMaxValue(int[]ary) {

	int maxval = 0 ;
	boolean isTrue =false;
	for(int i=0; i<ary.length; i++) {
	isTrue =maxval < ary[i];}
	maxval = ary[maxval];

}
}
}
		return maxval;
}
