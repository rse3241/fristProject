package XD;

public class PersonExe {
	static PersonExe singleton = new PersonExe();
	public static Person[] PersonArry = new Person[100];
//?
	public static PersonExe getInstance() {
		return singleton; //�ǹ�
	}

	public void execute() {

		while (true) {
			System.out.println("1.����߰� 2.�����ȸ 3.���� 4.���� 5.����");
			int menu = ScanUtil.readInt("�����ϼ���");
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
			System.out.println("��");
		}

	}

	public void addPerson() {
		System.out.println("1.�Ϲ��� 2.�л� 3 ������");
		int a = ScanUtil.readInt("�ش��ϴ� �����Է�");
		String name = ScanUtil.readStr("�̸��Է�");
		String gender = ScanUtil.readStr("�����Է�");
		String phone = ScanUtil.readStr("��ȣ ��������");
		Person person = null;
		if (a == 1) {
			person = new Person ( name,gender,phone);
		} else if (a == 2) {
			String school = ScanUtil.readStr("�б��Է�");
			person = new Student(name,gender,phone,school);
		}	else if (a == 3) {
			String company = ScanUtil.readStr("���� ������");
			person = new Worker(name,gender,phone,company);
		}
		
		
		for (int i = 0; i < PersonArry.length; i++) {
			if (PersonArry[i] == null) {//?
				PersonArry[i] = person;
				System.out.println("���: �����ϿϷ�");
				break;
			}
		}

	}
	public void showlist() {
		String gender = ScanUtil.readStr("��ȸ�� ���� �Է�");
		for ( int i = 0; i < PersonArry.length; i++){
			if (PersonArry[i] != null) {
				
			}
		}
		
		
	}
}
