package member;

public class UserExample {

	public static void main(String[] args) {
		User user1 = null;
		user1 = new User("user1","1234");
		user1.setUserAge(20);
		user1.setUserName("��浿");
		user1.setUserGrade(Grade.GUEST);
		
		
		user1.getUserId();
		user1.getUserAge();
		
		User user2 = new User("user2","55555","�����",Grade.MID,30);
	String name	= user2.getUserName();// ó������� �ʵ尪�� �ʱⰪ
	int age = user2.getUserAge();
	Grade grade = user2.getUserGrade();
	
	if(!name.equals("�����2")) {// equals ���ؼ� ��¥ ��¥�� ����
		user2.setUserGrade(Grade.SUPER);
	}
	if(age >= 20) {
		user2.setUserGrade(Grade.SPECIAL);
	}
	if(grade == Grade.MID) {
		user2.setUserGrade(grade);
	}
	System.out.println(user2.toString());
	user2.showInfo();
	
	User user3 = new SpecialUser("user3","55555","�����",Grade.MID,30,1500);
	user3.showInfo();
	
	}

}
