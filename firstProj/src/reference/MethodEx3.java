package reference;

public class MethodEx3 {

	public static void main(String[] args) {
		
		int[] intAry = {30,40,50,60,70 };
		int sum = 0;
		double avg =0;
		for(int num: intAry) {
			sum += num;
		}
		System.out.println("합:"+sum);
		avg = avgArray(intAry);
		System.out.println("평균:"+avg);
		sum=0;
		int[]intAry2 = {30,40};
		sum = sumArray(intAry2);
		System.out.println("합2:"+sum);
		
		System.out.println("평균:"+avg);
	}
	// 배열을 매개변수.
	
	public static int sumArray(int[] intAry) {
		int sum =0;
		for (int num : intAry) {
			sum+=num;
		}
		return sum;
	}
	
	//배열을 매개변수 -> 평균 avgArray()
	public static double avgArray(int[] intAry) {
		int sum = sumArray(intAry);
		double avg = (double)sum / intAry.length;
		return avg;
		
	}
		
	
	
}
