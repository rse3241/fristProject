package member;
enum Grade {
	SPECIAL, SUPER, MID,GUEST
}
public class User {
	//����� ���̵� ,��й�ȣ ,����� �̸�,���,����
	private	String userId; // null
	private	String userPw;
	private	String userName;
	private	Grade userGrade;
	private	int userAge;// �ʱⰪ 0  //�ʵ�
	//������
	public User() {}	
	public User(String userId, String userPw) {
		this.userId = userId; //this ?
		this.userPw = userPw;
	}
	public User(String userId, String userPw ,String userName , Grade userGrade , int userAge) {
		this(userId , userPw);
		this.userName = userName;
		this.userAge = userAge;
		this.userGrade=userGrade;
	}
	
	public String getUserId() { //�޼ҵ� ��ɴ��
		return userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userGrade=" + userGrade
				+ ", userAge=" + userAge + "]";
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Grade getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(Grade userGrade) {
		this.userGrade = userGrade;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public void showInfo() { // void�� ���ϰ��̾�� ��°��� ���� 
		System.out.println("User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userGrade=" + userGrade
				+ ", userAge=" + userAge + "]");
	}
	
}
