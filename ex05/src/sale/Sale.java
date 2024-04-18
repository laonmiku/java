package sale;

public class Sale {
	private int code;
	private String name;
	private int price;
	private int qnt;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	@Override // 재 정의
	public String toString() {
		return "Sale [코드=" + code + ", 이름=" + name + ", 가격=" + price + ", 수량=" + qnt + "]";
	}
	
	
	
}