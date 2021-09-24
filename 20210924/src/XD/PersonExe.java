package XD;

public class PersonExe {
	static PersonExe singleton = new PersonExe();
	public static Person[] PersonArry = new Person[100];
//?
	public static PersonExe getInstance() {
		return singleton; //의문
	}

	public void execute() {

		while (true) {
			System.out.println("1.사람추가 2.사람조회 3.수정 4.삭제 5.종료");
			int menu = ScanUtil.readInt("선택하세요");
			if (menu == 1) {
				addPerson();
			}
			if (menu == 2) {

			}
			if (menu == 3) {

			}
			if (menu == 4) {

			}
			if (menu == 5) {
				break;
			}
			System.out.println("끝");
		}

	}

	public void addPerson() {
		System.out.println("1.일반인 2.학생 3 직장인");
		int a = ScanUtil.readInt("해당하는 숫자입력");
		String name = ScanUtil.readStr("이름입력");
		String gender = ScanUtil.readStr("성별입력");
		String phone = ScanUtil.readStr("번호 적으세요");
		Person person = null;
		if (a == 1) {
			person = new Person ( name,gender,phone);
		} else if (a == 2) {
			String school = ScanUtil.readStr("학교입력");
			person = new Student(name,gender,phone,school);
		}	else if (a == 3) {
			String company = ScanUtil.readStr("직장 적으셈");
			person = new Worker(name,gender,phone,company);
		}
		
		
		for (int i = 0; i < PersonArry.length; i++) {
			if (PersonArry[i] == null) {//?
				PersonArry[i] = person;
				System.out.println("결과: 사람등록완료");
				break;
			}
		}

	}
	public void showlist() {
		String gender = ScanUtil.readStr("조회할 성별 입력");
		for ( int i = 0; i < PersonArry.length; i++){
			if (PersonArry[i] != null) {
				
			}
		}
		
		
	}
}
