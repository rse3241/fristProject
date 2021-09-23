package co.yedam.inherit;
/// people 상속  Student

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
	   //override 재정의

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("name:"+super.getName()+",SSN:"+this.getSsn()+",SNO:"+this.getSsn());
	}
	 // Student -> People -> Object
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "학생 [이름"+this.getName()+"주민번호"+this.getSsn()+"학번"+this.getStudentNo()+"]";
	   
	}
}