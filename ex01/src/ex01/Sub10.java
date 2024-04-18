package ex01;

import java.util.Scanner;

public class Sub10 {
	public static void run() {
		boolean run= true;
		Scanner scan = new Scanner(System.in);
		String[] names = new String[100];
		int[] prices= new int[100];
		int[] qnt =new int [100];
		int count=0;
		
		while (run) {
			System.out.println("-----------------------");
			System.out.println("1.매출 등록  2.매출 현황  0.종료");
			System.out.println("----------------------");
			System.out.println("선택하기>>");
			String menu=scan.nextLine();
			switch(menu) {
			case "1":
				System.out.println("이름>>");
				String name= scan.nextLine();
				names[count] = name;
				System.out.println("단가>>");
				int price = Integer.parseInt(scan.nextLine());
				prices[count] = price;
				System.out.println("수량>>");
				int qn =Integer.parseInt(scan.nextLine());
				qnt[count] = qn;
				System.out.println("등록완료!");
				count++;
				break;
			case "2":
				if(count==0){
					System.out.println("등록된 상품이 없습니다.");
				}
				else {
					for(int i=0;i<count;i++) {
						int sum= prices[i]* qnt[i];
						System.out.printf("%s\t%d\t%d\t%d\n",
								names[i],prices[i],qnt[i],sum);
						System.out.println("---------------------------------");
						}
				
				}
				break;
			
				case "0":
					System.out.println("시스템 종료");
				run=false;

				
				break;
			default:
				System.out.println("0~2번을 입력하숑");
			}
				
			
			//switch
			
		}//while
	}//run
}//class
