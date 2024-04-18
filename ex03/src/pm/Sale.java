package pm;

public class Sale {
	//필드
	String code;
	String name;
	int price;
	int qnt;
	
	//생성자 (기본생성자만쓸거면 생략가능)
	public Sale() {
		
	}//기본생성자,,
	
	
	
	
	public Sale(String code, String name, int price, int qnt) { //생성자2
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.qnt = qnt;
	}//값을 넣어주면서만들겟다는것,,,




	//금액을 구하는 메소드
	public int sum() {
		int sum=price*qnt;
		return sum;
	}
	
	//내용 가로출력 메소드
	public void print_land() {
		System.out.printf("%s번\t%s\t%d만원\t%d개\t%,d만원\n",
				code,name,price,qnt,sum());
	}
	
	//내용 세로출력 메소드
	public void print_port() {
		System.out.println("번호 : "+code+"번");
		System.out.println("이름 : "+name);
		System.out.println("가격 : "+price+"만원");
		System.out.println("수량 : "+qnt+"개");
		System.out.printf("금액 : %,d만원\n",sum());
	}
}
