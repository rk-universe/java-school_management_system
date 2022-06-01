package StudentManagementSystem;

public class students {
	

	private String First_name;
	private String Last_name;
	private int student_id;
	private int std;
	private int age;
	private String gender;
	private int contact;
	private String city;
	private int Total_Fee;
	private String Fee_status;
	private int Fee_Balance;
	
	
	
	//Getters and Setters
	public int getTotal_Fee() {
		return Total_Fee;
	}
	public void setTotal_Fee(int total_Fee) {
		Total_Fee = total_Fee;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFee_status() {
		return Fee_status;
	}
	public void setFee_status(String fee_status) {
		Fee_status = fee_status;
	}
	public int getFee_Balance() {
		return Fee_Balance;
	}
	public void setFee_Balance(int fee_Balance) {
		Fee_Balance = fee_Balance;
	}
	public String getFirst_name() {
		return First_name;
	}
	public void setFirst_name(String first_name) {
		First_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
