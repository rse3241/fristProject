package reference;

public class MethodEx5555 {

	public static void main(String[] args) {
		int [] score = {88,67,92,73,58};
		//최소값을구하는코드.
		int sc = getMinvalue(score);
		System.out.println(sc);

	}
public static int getMinvalue(int[]ary) {
	boolean run =false;
	for (int a=0; a < ary.length; a++) {
	int	 b = 100;
		run = b <ary [a];
		if(run) {
			b = ary[a];
		}
	}
	
	
	
	
	return ary;
}	
}
