package co.yedam.inherit;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People p1 = new People("hong", "202120202020");
		System.out.println("�̸�:" + p1.getName());
		System.out.println("��ȣ:" + p1.getSsn());
		p1.showInfo();
		System.out.println(p1.toString());
		Student s1 = new Student("park", "789465654");
		System.out.println("�̸�:" + s1.getName());
		System.out.println("��ȣ:" + s1.getSsn());
		s1.showInfo();
		Student s2 = new Student("choi", "4564658566," + 110);
		System.out.println("�̸�:" + s2.getName());
		System.out.println("��ȣ:" + s2.getSsn());
		System.out.println("�л���ȣ:" + s2.getStudentNo());
		s2.showInfo();
		System.out.println(s1.toString());
		People p2 = new Student("hwag", "456456456", 120);
		p1 = new Student("hwag", "456456456", 120);

		//People s3 = new People();
		// p2.getStudentNo(); �θ�Ŭ���� ���� �ڽ�Ŭ������ �޼ҵ�ȣ�� �Ұ���
		if (p2 instanceof Student) {
			Student s31 = (Student) p2;
			s31.getStudentNo();
		}
		if (p2 instanceof Student) {

			Student s4 = (Student) p1;
			s4.getStudentNo();
		} else {
			System.out.println("����ȯ �Ҽ������ϴ�");

			;
		}
	}
}