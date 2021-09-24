package co.yedam.inherit;

import co.yedam.account.ScanUtil;

public class FriendExe {

	static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		friends = new Friend[100];

		// 친구,학교친구,회사친구 => 배열에 저장.
		// CompFriend ->Friend,nivfriend -> friend
		friends = new Friend[100];
		friends[0] = new Friend("홍길동", "1111-1211");
		friends[1] = new Friend("김길동", "2222-1211");
		friends[2] = new Friend("홍수아", "2222-1311");
		friends[3] = new Univfriend("박수진", "23456-1234", "수학과");
		friends[4] = new CompFriend("김철수", "2222-1212", "영업부");
		friends[5] = new Friend("홍길동", "2222-12451");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {

		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.친구등록2.조회3.수정4.삭제5.종료");
			System.out.println("----------------------------");
			int menu = ScanUtil.readInt("메뉴를 선택하세요."); // 인스턴스 메모리 할당.
			{
				if (menu == 1) {
					System.out.println("등록");
					addFriend();
				} else if (menu == 2) {
					System.out.println("조회");
					showList();
				} else if (menu == 3) {
					System.out.println("수정");
					modify();
				} else if (menu == 4) {
					System.out.println("삭제");
					remove();
				} else if (menu == 5) {
					System.out.println("종료합니다");
					break;
				}
			}
			System.out.println("끝");
		} 
	}

	private void addFriend() {//생성
		// 친구, 학교친구, 회사친구
		System.out.println("1친구 2.학교친구 3회사친구");
		int chice = ScanUtil.readInt("메뉴 선택");
		String name = ScanUtil.readStr("친구이름 입력");
		String phone = ScanUtil.readStr("연락처 입력");
		Friend friend = null;
		if (chice == 1) {
			friend = new Friend(name, phone);
		} else if (chice == 2) {
			String major = ScanUtil.readStr("전공입력");
			friend = new Univfriend(major, phone, name);
		} else if (chice == 3) {
			String depart = ScanUtil.readStr("부서 선택");
			friend = new Univfriend(depart, phone, name);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("등록성공");
	}

	private void showList() {//조회
		// 이름 연락처 입력 => 홍길동,감갈동 -> "길동."
		// 1111-1211 , 2222-1211 -> 1211
		// 길동,1211 -> 이름 & 연락처.
		String name = ScanUtil.readStr("조회할 이름입력");

		String phone = ScanUtil.readStr("조회할 연락처 입력");

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				// 2.이름 입력했는지 3.전화번호 입력했는지 1.둘다 입력했는지
				if (!name.equals("") && !phone.equals("")) {
					if (friends[i].getName().indexOf(name) != -1 && friends[i].getPhone().indexOf(phone) != -1)
						System.out.println(friends[i].toString());
				} else if (!name.equals("")) {
					if (friends[i].getName().indexOf(name) != -1)
						System.out.println(friends[i].toString());
				} else if (!phone.equals("")) {
					if (friends[i].getName().indexOf(name) != -1)
						System.out.println(friends[i].toString());

					else {
						System.out.println(friends[i].toString());
					}
				}
			}


		}

	}

	private void modify() {//수정
		System.out.println("친구목록");
		
	for(int i =0; i<friends.length; i++) {
	if(friends[i] != null)
		System.out.println("["+i+"]"+friends[i].toString());
	}
	int num= ScanUtil.readInt("친구를 선택하세요");
	String phone = ScanUtil.readStr("바꿀번호 입력하세요");
	friends[num].setPhone(phone);
	if(friends[num] instanceof Univfriend) {
		String major = ScanUtil.readStr("바꿀 전공을 입력하세요");
		friends[num].setmajor(major);
	}else if (friends[num]instanceof CompFriend) {
			String depart = ScanUtil.readStr("바꿀부서 입력");
			
			((CompFriend) friends [num]).setDepart(depart);
		}	
	System.out.println("수정완료");
}
	private void remove() {System.out.println("친구목록");
	
for(int i =0; i<friends.length; i++) {
if(friends[i] != null)
	System.out.println("["+i+"]"+friends[i].toString());
}
		
			int num= ScanUtil.readInt("삭제할 친구를 입력하세요");
			
			friends[num] =null;
			System.out.println("삭제할 정보가없습니다");
			System.out.println("삭제완료");
	}
	}


