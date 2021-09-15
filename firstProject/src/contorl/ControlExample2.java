package contorl;

public class ControlExample2 {

	public static void main(String[] args) {
		String inputValue = "b";
		
		switch(inputValue) {
		case "a":
			System.out.println("잘했습니다!!");
			break;
		case "b":
			System.out.println("잘했습니다!.");
			break;
		case "c":
			System.out.println("보통입니다.");
			break;
		case"d":
			System.out.println("노력하세요.");
			break;
		default:
			System.out.println("실망하세요.");
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
