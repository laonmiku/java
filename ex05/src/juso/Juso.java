package juso;

public class Juso {

	private int no;
	private String name;
	private String phone;
	private String address;
	
	public int getNo() { //VO
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Juso [no=" + no + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	 
	
	
}
