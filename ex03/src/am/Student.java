package am;

public class Student {
	//field 필드 (속성)
	String no ;
	String name;
	String address;
	String phone;
	
	//생성자(객체생성)//생성자1
	public Student() {
		
	}
	
	
	public Student(String no, String name) { //생성자2
		//super();없어도댄뎅,,우선순위때문인듯?
		this.no = no;
		this.name = name;
	}

	

	


	public Student(String no, String name, String address, String phone) {//생성자3
		super();
		this.no = no;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}


	//method 메소드(명령어의 집합)
	public void print() {
		System.out.printf("학번:%s\n이름:%s\n주소:%s\n전화:%s\n",
							no,name,address,phone);
	}
	
}
