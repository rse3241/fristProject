package XD;

public class Student extends Person {
	
		
		// TODO Auto-generated constructor stub
	

	public Student(String name, String gender, String phone, String school) {
		super(name, gender, phone);
		this.school = school;
	}

	public String school;

	@Override
	public String toString() {
		return "Student [school=" + school + ", name=" + name + ", gender=" + gender + ", phone=" + phone
				+ ", getSchool()=" + getSchool() + "]";
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
}
