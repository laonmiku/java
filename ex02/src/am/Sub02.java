package am;

import java.util.Scanner;

public class Sub02 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		System.out.println("\t☎매출현황☎");
		boolean run=true;
		String [] names = new String[100];
		int [] prices = new int [100];
		int [] qnts = new int [100];
		names[0]="냉장고" ; prices[0]= 350; qnts[0]=15;
		names[1]="세탁기" ; prices[1]= 250; qnts[1]=17;
		int count = 2;
		while (run) {
			System.out.println("\n=================================");
			System.out.println("    1.매출등록  2.매출현황  0.종료");
			System.out.println("=================================");
			System.out.print("번호를 누르숑>");
			String menu = scan.nextLine();
			switch(menu) {
			case "1":
				System.out.println("상품이름 누르숑>");
				String name= scan.nextLine();
				System.out.println("상품가격 누르숑>");
				int price= Integer.parseInt(scan.nextLine());
				System.out.println("상품수량 누르숑>");
				int qnt= Integer.parseInt(scan.nextLine());
				names[count]=name;
				prices[count]=price;
				qnts[count]=qnt;
				count=count+1;
				System.out.println("정보등록 끝났숑<");
				break;
			case "2":
				System.out.println("---------------------------------");
				int tot_sum=0;
				int tot_qnt=0;
				for(int i=0; i<count; i++) {
					int sum = prices[i] * qnts[i];
					System.out.printf("%s\t%d만원\t%d개\t%,d만원\n",
										names[i],prices[i],qnts[i],sum);
					tot_sum=tot_sum+sum;
					tot_qnt=tot_qnt+qnts[i];
				}//for
				System.out.println("---------------------------------");
				System.out.printf("\t\t%d개\t%,d만원\n",tot_qnt,tot_sum);
				System.out.println("---------------------------------");
				System.out.println(count+"개의 상품이 등록되있숑");
				System.out.println("---------------------------------");
				break;
			case "0":
				run=false;
				break;
			default: 
				System.out.println("0~2번을 누르숑");
				break;
			
			}//switch	
		}//while
		System.out.println("프로그램 종료했숑");
	}//run
}//class
