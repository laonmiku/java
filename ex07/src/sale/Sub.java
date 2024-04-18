package sale;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import product.*;

public class Sub {
	public static void run() {
		SaleDAO dao=new SaleDAO();
		ProductDAO pdao= new ProductDAO();
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		DecimalFormat df =new DecimalFormat("#,###원");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

		while(run) {
			System.out.println("\n=========================================");
			System.out.println("1.판매등록|2.판매조회|3.판매현황|4.판매삭제|0.종료");
			System.out.println("=========================================");
			System.out.println("선택>");
			String menu= scan.nextLine();
			switch(menu) {
			case "1" ://등록
				System.out.print("상품코드>");
				String code1=scan.nextLine();
				ProductVO vo1=pdao.read(code1);
				if(vo1.getCode()==null) {
					System.out.println(code1+"번 상품이 존재하지 않습니다.");
				}else {
					SaleVO svo=new SaleVO();
					svo.setCode(code1);
					System.out.println("상품명 :"+vo1.getName());
					String today =sdf.format(new Date());
					System.out.print("판매일 :"+today+">");
					String date=scan.nextLine();
					if(date !="") {
						svo.setSale_date(date);
					}else {
						svo.setSale_date(today);
					}
					System.out.print("판매가 :"+vo1.getPrice()+">");
					String price=scan.nextLine();
					if(price !="") {
						svo.setPrice(Integer.parseInt(price));
					}else {
						svo.setPrice(vo1.getPrice());
					}
					System.out.print("수량 >");
					String qnt = scan.nextLine();
					if(qnt!="") {
						svo.setQnt(Integer.parseInt(qnt));
					}else {
						svo.setQnt(1);
					}
					
					
					System.out.println(svo.toString());
					dao.insert(svo);
					System.out.println("매출등록완료!");
				}
				break;
				
			case "2" ://조회
				System.out.println("조회할 상품 코드>");
				String code2=scan.nextLine();
				ProductVO vo2 =pdao.read(code2);
				if(vo2.getCode()==null) {
					System.out.println(code2+"번 상품이 존재하지 않습니다");
				}else {
					System.out.println("상품이름:"+vo2.getName());
					System.out.println("상품단가:"+df.format(vo2.getPrice()));
				}
				break;
			case "3" ://현황
				for (SaleVO vo3 : dao.list())  {
					System.out.printf("%s\t%s(%s)\t%d개\t%,d원\n",
	                        vo3.getSale_date(), vo3.getName(), vo3.getCode(), vo3.getQnt()
	                        ,vo3.getPrice());
				}
				break;
				
			case "4" ://삭제
				break;
			case "0" :
				System.out.println("판매관리를 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("0~4번 메뉴를 입력하세요!");
				break;
			}//switch   
		}//while

	}

}