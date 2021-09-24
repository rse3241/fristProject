package member;

public class UserExample {

	public static void main(String[] args) {
		User user1 = null;
		user1 = new User("user1","1234");
		user1.setUserAge(20);
		user1.setUserName("고길동");
		user1.setUserGrade(Grade.GUEST);
		
		
		user1.getUserId();
		user1.getUserAge();
		
		User user2 = new User("user2","55555","상용자",Grade.MID,30);
	String name	= user2.getUserName();// 처음만들면 필드값은 초기값
	int age = user2.getUserAge();
	Grade grade = user2.getUserGrade();
	
	if(!name.equals("상용자2")) {// equals 비교해서 진짜 가짜로 나눔
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
	
	User user3 = new SpecialUser("user3","55555","상용자",Grade.MID,30,1500);
	user3.showInfo();
	
	}

}
