package XD;

public class Worker extends Person {
	
	
	public Worker(String name, String gender, String phone, String company) {
		super(name, gender, phone);
		this.company = company;
	}

	public String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
