package javaOOP;

public class Topic_06_Getter_Setter {
	
	//Kiểm tra/validate dữ liệu được
	private String personName;
	private int personAge;
	private int personPhone;
	private float personBankAccountAmout;
	
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		if (personName == null || personName.isEmpty() || personName.isBlank()) {
			throw new IllegalArgumentException("Tên bạn nhập không hợp lệ !");
		}else {
			this.personName = personName;
		}
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		if (personAge >0 && personAge <120) {
			this.personAge = personAge;
		}else {
			throw new IllegalArgumentException("Tên bạn nhập không hợp lệ !");
		}
		
	}

	public int getPersonPhone() {
		return personPhone;
	}

	public void setPersonPhone(int personPhone) {
		if (!String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("Số điện thoại bắt đầu bằng : 09-03-012-016-018-019.");
		}else if(personPhone <10 || personPhone >11 ) {
			throw new IllegalArgumentException("Số điện thoại là 10 hoặc 11 số");
		}else {
		this.personPhone = personPhone;
		}
	}

	public float getPersonBankAccountAmout() {
		return personBankAccountAmout;
	}

	public void setPersonBankAccountAmout(float personBankAccountAmout) {
		this.personBankAccountAmout = personBankAccountAmout;
	}

	public void showPersonInfo() {
		System.out.println(this.personName);
		System.out.println(this.personAge);
		System.out.println(this.personPhone);
	}
}
