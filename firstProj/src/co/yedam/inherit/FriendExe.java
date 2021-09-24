package co.yedam.inherit;

import co.yedam.account.ScanUtil;

public class FriendExe {

	static FriendExe singleton = new FriendExe();
	private Friend[] friends;

	private FriendExe() {
		friends = new Friend[100];

		// ģ��,�б�ģ��,ȸ��ģ�� => �迭�� ����.
		// CompFriend ->Friend,nivfriend -> friend
		friends = new Friend[100];
		friends[0] = new Friend("ȫ�浿", "1111-1211");
		friends[1] = new Friend("��浿", "2222-1211");
		friends[2] = new Friend("ȫ����", "2222-1311");
		friends[3] = new Univfriend("�ڼ���", "23456-1234", "���а�");
		friends[4] = new CompFriend("��ö��", "2222-1212", "������");
		friends[5] = new Friend("ȫ�浿", "2222-12451");
	}

	public static FriendExe getInstance() {
		return singleton;
	}

	public void execute() {

		while (true) {
			System.out.println("----------------------------");
			System.out.println("1.ģ�����2.��ȸ3.����4.����5.����");
			System.out.println("----------------------------");
			int menu = ScanUtil.readInt("�޴��� �����ϼ���."); // �ν��Ͻ� �޸� �Ҵ�.
			{
				if (menu == 1) {
					System.out.println("���");
					addFriend();
				} else if (menu == 2) {
					System.out.println("��ȸ");
					showList();
				} else if (menu == 3) {
					System.out.println("����");
					modify();
				} else if (menu == 4) {
					System.out.println("����");
					remove();
				} else if (menu == 5) {
					System.out.println("�����մϴ�");
					break;
				}
			}
			System.out.println("��");
		} 
	}

	private void addFriend() {//����
		// ģ��, �б�ģ��, ȸ��ģ��
		System.out.println("1ģ�� 2.�б�ģ�� 3ȸ��ģ��");
		int chice = ScanUtil.readInt("�޴� ����");
		String name = ScanUtil.readStr("ģ���̸� �Է�");
		String phone = ScanUtil.readStr("����ó �Է�");
		Friend friend = null;
		if (chice == 1) {
			friend = new Friend(name, phone);
		} else if (chice == 2) {
			String major = ScanUtil.readStr("�����Է�");
			friend = new Univfriend(major, phone, name);
		} else if (chice == 3) {
			String depart = ScanUtil.readStr("�μ� ����");
			friend = new Univfriend(depart, phone, name);
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("��ϼ���");
	}

	private void showList() {//��ȸ
		// �̸� ����ó �Է� => ȫ�浿,������ -> "�浿."
		// 1111-1211 , 2222-1211 -> 1211
		// �浿,1211 -> �̸� & ����ó.
		String name = ScanUtil.readStr("��ȸ�� �̸��Է�");

		String phone = ScanUtil.readStr("��ȸ�� ����ó �Է�");

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				// 2.�̸� �Է��ߴ��� 3.��ȭ��ȣ �Է��ߴ��� 1.�Ѵ� �Է��ߴ���
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

	private void modify() {//����
		System.out.println("ģ�����");
		
	for(int i =0; i<friends.length; i++) {
	if(friends[i] != null)
		System.out.println("["+i+"]"+friends[i].toString());
	}
	int num= ScanUtil.readInt("ģ���� �����ϼ���");
	String phone = ScanUtil.readStr("�ٲܹ�ȣ �Է��ϼ���");
	friends[num].setPhone(phone);
	if(friends[num] instanceof Univfriend) {
		String major = ScanUtil.readStr("�ٲ� ������ �Է��ϼ���");
		friends[num].setmajor(major);
	}else if (friends[num]instanceof CompFriend) {
			String depart = ScanUtil.readStr("�ٲܺμ� �Է�");
			
			((CompFriend) friends [num]).setDepart(depart);
		}	
	System.out.println("�����Ϸ�");
}
	private void remove() {System.out.println("ģ�����");
	
for(int i =0; i<friends.length; i++) {
if(friends[i] != null)
	System.out.println("["+i+"]"+friends[i].toString());
}
		
			int num= ScanUtil.readInt("������ ģ���� �Է��ϼ���");
			
			friends[num] =null;
			System.out.println("������ �����������ϴ�");
			System.out.println("�����Ϸ�");
	}
	}


