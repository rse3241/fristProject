package member;

public class SpecialUser  extends User{ // extends ��� �ڿ��� ��ӹ޴� Ŭ����
	private int point;
	
	
	
	public SpecialUser(String userId, String userPw, String userName, Grade userGrade, int userAge) {
		super(userId, userPw, userName, userGrade, userAge);
		// TODO Auto-generated constructor stub
			}
	public SpecialUser(String userId, String userPw, String userName, Grade userGrade, int userAge , int point) {
		super(userId, userPw, userName, userGrade, userAge);
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println();
	}

private int point1;

public int getPoint() {
	return point;
}

public void setPoint(int point) {
	this.point = point;
}


}
