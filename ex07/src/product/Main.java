package product;

import java.util.*;

import sale.Sub;

public class Main{
	public static void main(String[] args) {

		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ProductDAO dao= new ProductDAO();
		while(run) {
			System.out.println("\n=========================================================");
			System.out.println("1.상품등록|2.상품조회|3.상품목록|4.상품삭제|5.상품수정|6.매출관리|0.종료");
			System.out.println("==========================================================");
			System.out.println("선택>");
			String menu= scan.nextLine();
			switch(menu) {
			case "6" :
				Sub.run();
				break;
			case "5" ://수정
				System.out.print("수정할 상품 코드>");
				String code5=scan.nextLine();
				ProductVO vo5=dao.read(code5);
				if(vo5.getCode()==null) {
					System.out.println(code5+"번 상품이 존재하지 않습니다");
				}else {
					//이름수정
					System.out.print("상품이름:"+vo5.getName()+">");
					String name5=scan.nextLine();
					if(!name5.equals("")) vo5.setName(name5);
					
					//가격수정,,근데 숫자 유효성체크까지하는,,
					while(true) {
						System.out.println("상품가격:"+vo5.getPrice()+">");
						String price5=scan.nextLine();
						if(price5.equals("")) { //엔터친경우
							break;
						}
						if(isNumber(price5)) {//숫자인경우
							vo5.setPrice(Integer.parseInt(price5));
							break;
						}
					}//가격입력받는와일문
					System.out.println(vo5.toString());
					System.out.println("정말로 수정하실래요? (y)");
					String sel = scan.nextLine();
					if(sel.equals("y") || sel.equals("Y")) {
						dao.update(vo5);
						System.out.println("상품정보수정완료");
					}else {
						System.out.println("수정을 취소합니다.");
					}
				}	
				break;
			case "1" ://등록
				ProductVO vo1=new ProductVO();
				vo1.setCode(dao.getCode());
				System.out.println("상품코드:"+vo1.getCode());
				System.out.print("상품이름>");
				String name1=scan.nextLine();
				if(name1=="") {
					System.out.println("상품등록을 취소합니다");
					break;
				}else {
					vo1.setName(name1);
				}
				while(true) {
					System.out.print("상품 가격>");
					String price1=scan.nextLine();
					if(price1=="") {
						System.out.println("상품등록취소!");
						break;
					}
					if(isNumber(price1)) {
						vo1.setPrice(Integer.parseInt(price1));
						System.out.println(vo1.toString());
						dao.insert(vo1);
						System.out.println("상품등록완료!");
						break;
					}
//					if(price1!="" && isNumber(price1)) {
//						
//						System.out.println(vo1.toString());
//						dao.insert(vo1);
//						System.out.println("상품등록완료!");
//						break;
//					}
				}
				break;
			case "2" ://조회
				while(true) {
					System.out.print("조회할 상품코드>");
					String code2 = scan.nextLine();
					ProductVO vo2= dao.read(code2);
					if(vo2.getCode()==null) {
						System.out.println(vo2.getCode()+"상품이 존재하지 않습니다.");
						break;
					}else {
						System.out.println(vo2.toString());
					}
					break;
				}
			case "3" ://목록
				ArrayList<ProductVO>array=dao.list();
				for(ProductVO vo:array) {
					System.out.println(vo.toString());
				}
				break;
			case "4" ://삭제
				System.out.print("삭제할 상품코드>");
				String code4=scan.nextLine();
				ProductVO vo4= dao.read(code4);
				if(vo4.getCode()==null) {
					System.out.println(code4+"번 상품이 존재하지 않습니다");
				}else {
					System.out.println(vo4.toString());
					System.out.print("정말로 삭제하실래요?(y)");
					String sel = scan.nextLine();
					if(sel.equals("y") || sel.equals("Y")) {
						if(dao.delete(code4)) {
							System.out.println("상품정보삭제완료!");
						}else {
							System.out.println("상품정보삭제실패!");
						}
					}else {
						System.out.println("삭제를 취소합니다.");
					}
				}
				break;
			case "0" :
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("0~4 메뉴를 입력하세요!");
				break;
			}//switch   
		}//while
	}//method
//유효성체크 (숫자)
public static boolean isNumber(String str) {
	try {
		Integer.parseInt(str);
		return true;
	}catch(Exception e) {
		System.out.println("숫자로 입력하세요");
		return false;
	}
}
	
	
}
