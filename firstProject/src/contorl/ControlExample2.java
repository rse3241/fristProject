package contorl;

public class ControlExample2 {

	public static void main(String[] args) {
		String inputValue = "b";
		
		switch(inputValue) {
		case "a":
			System.out.println("���߽��ϴ�!!");
			break;
		case "b":
			System.out.println("���߽��ϴ�!.");
			break;
		case "c":
			System.out.println("�����Դϴ�.");
			break;
		case"d":
			System.out.println("����ϼ���.");
			break;
		default:
			System.out.println("�Ǹ��ϼ���.");
		}

		switch(inputValue) {
		case "a":
		case "b":
		case "c":
			System.out.println("na");
			break;
		case "d":
			System.out.println("pass");
		
		}
	}

}
