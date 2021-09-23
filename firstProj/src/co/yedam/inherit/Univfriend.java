package co.yedam.inherit;

public class Univfriend  extends Friend{
	private String major; //ÇÊµå
	
	public Univfriend (String name , String phone , String major) {
		super(name,phone);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Univfriend [major=" + major + "]";
	}
	
}

