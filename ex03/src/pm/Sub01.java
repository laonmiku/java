package pm;
import java.util.*;
public class Sub01 {
	public static void run() {
		System.out.println("Sub01,,,,");
		Scanner scan=new Scanner(System.in);
		ArrayList<Sale>sales=new ArrayList<Sale>();
		Sale s1=new Sale();
		s1.code="100";
		s1.name="냉장고";
		s1.price=350;
		s1.qnt=15;
		sales.add(s1);
		
		Sale s2=new Sale("101","세탁기",270,25);
		sales.add(s2);
		
		boolean run = true;
		while(run) {
			System.out.println("\n==============================================");
			System.out.println(" 1.매출등록 2.매출현황 3.상품검색 4.매출삭제 0.종료하기");
			System.out.println("==============================================\n");
			System.out.println("번호를 입력>>");
			String menu = scan.nextLine();
			
			switch(menu) {
			case "1" :
				
			/*	Sale s3=new Sale(); //순서바뀌면안됨,,
				
				System.out.println("상품의 번호를 입력하세요>>");
				s3.code=scan.nextLine();
				System.out.println("상품의 이름을 입력하세요>>");
				s3.name=scan.nextLine();
				System.out.println("상품의 가격을 입력하세요>>");
				s3.price=Integer.parseInt(scan.nextLine());
				System.out.println("상품의 수량을 입력하세요>>");
				s3.qnt=Integer.parseInt(scan.nextLine());
				
				sales.add(s3);
				System.out.println("상품등록 완료!");
			*/
				Sale s3=new Sale(); //순서바뀌면안됨,,
				Sale last =sales.get(sales.size()-1); //요거추가함,,이건마지막번호를불러옴
				int code=Integer.parseInt(last.code)+1; //요건 내가다음에추가할번호를 데려다줌그래서 라스트에서+1
				//s3.code=code+""; 이것도 아래밸류옾도 둘다 스트링으로바꿔줌!
				s3.code=String.valueOf(code);
				System.out.println("상품의 번호를 입력하세요>>"+s3.code);
				//s3.code=scan.nextLine(); 이미 들어가게해서 지웟음!
				
				System.out.println("되돌아가려면 엔터키>>");
				System.out.println("상품의 이름을 입력하세요>>");
				s3.name=scan.nextLine();
				if(s3.name=="") {
					break;
				}
				
				while(true) {
					System.out.println("상품의 가격을 입력하세요>>");
					//s3.price=Integer.parseInt(scan.nextLine());
					String price=scan.nextLine();
				
					if(checkNumber(price)) {
					s3.price=Integer.parseInt(price);
					break;
					}
				}
				
				
				while(true) {
					System.out.println("상품의 수량을 입력하세요>>");
				//s3.qnt=Integer.parseInt(scan.nextLine());
					String qnt=scan.nextLine();
					
						if(checkNumber(qnt)) {
							s3.qnt=Integer.parseInt(qnt);
							break;
						}
					}
				
				sales.add(s3);
				System.out.println("-------------------------------------------");
				System.out.println("상품등록 완료!");
				
				
				break;
				
			case "2" :
				int tot_qnt=0;
				int tot_sum=0;
				System.out.println("-------------------------------------------");
				System.out.println("품번\t품명\t가격\t수량\t총합\n");
				for(Sale s:sales) {
					s.print_land();
					tot_qnt+=s.qnt;
					tot_sum+=s.sum();
				}
				System.out.println("-------------------------------------------");
				System.out.println(sales.size()+"개 상품이 존재합니다.");
				System.out.println("-------------------------------------------");
				System.out.printf("총판매수량 : %d개\n",tot_qnt);
				System.out.printf("총판매금액 : %,d만원\n",tot_sum);
				System.out.println("-------------------------------------------");
				break;
				
			case "3" :
				
				while(true) {
				boolean find =false;
				System.out.println("조회할 상품이름이나 코드를 입력>>");
				System.out.println("되돌아가려면 엔터키>>");
				String sname=scan.nextLine();
					if(sname=="") {
					System.out.println("상품조회를 끝냅니다.");
					break;
					}
				
					for(Sale s:sales) {
						if(s.name.equals(sname)|| s.code.equals(sname)) {
						s.print_port();
						find=true;
						}
					}
					if(!find) {
					System.out.println("상품 "+sname+"은(는) 존재하지 않습니다.");
					}
				}//while
				break;
			case "4" :
				System.out.println("\n삭제할 상품이름이나 코드를 입력>>");
				System.out.println("되돌아가려면 엔터키>>");
				String sname=scan.nextLine();
				boolean find =false;


				for(Sale s:sales) {
					if(s.name.equals(sname)|| s.code.equals(sname)) {
						find=true;
						s.print_port();
						System.out.println("\n삭제하시겠습니까?\n>yes 혹은 >네");
						System.out.println("돌아가기는 아무거나<<\n");
						String ans=scan.nextLine();
						if(ans.equals("yes") || ans.equals("네")) {
							sales.remove(s);
							System.out.println("삭제완료");
							
						}
						else {
								System.out.println("삭제취소");
						}
						break;//for문을 빠져나감,,
					}

				}//for
				if(!find) {
					System.out.println("상품 "+sname+"은(는) 존재하지 않습니다.");
				}
				break;
				
			case "0" :
				run=false;
				System.out.println("프로그램종료");
				break;
			default:
				
				System.out.println("0~4번을 누르세요");
			//	System.out.println("끝내려면 엔터키>>");
				
				
				
			}
		}
	}//run
	//숫자인지아닌지 판별하는 메소드
	public static boolean checkNumber(String str) {
		try {
			int num=Integer.parseInt(str);
			return true;
		}
		catch(Exception e){
			System.out.println("숫자를 입력하세요");
			return false;
		}
	}
}