package co.yedam.inherit;

public class Friend {
	private String name;//필드
	private String phone;
	
	public Friend(String name, String phone  ) {//생성자
		this.name =name;
		this.phone= phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}

	public void setmajor(String major) {
		// TODO Auto-generated method stub
		
	}

	
	
	}
	

