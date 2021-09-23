package co.yedam.inherit;
/// people ���  Student

public class Student extends People {
	   private int studentNo;

	   Student(String name, String ssn) {
	      super(name, ssn);
	   }

	   Student(String name, String ssn, int studentNo) {
	      super(name, ssn);
	      this.studentNo = studentNo;
	   }
	   
	   public int getStudentNo() {
	      return studentNo;
	   }
	   //override ������

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("name:"+super.getName()+",SSN:"+this.getSsn()+",SNO:"+this.getSsn());
	}
	 // Student -> People -> Object
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�л� [�̸�"+this.getName()+"�ֹι�ȣ"+this.getSsn()+"�й�"+this.getStudentNo()+"]";
	   
	}
}