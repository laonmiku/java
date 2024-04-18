package ex01;

import java.util.*;

public class Sub09 {
	public static void run() {
		
		
		Scanner scan = new Scanner (System.in);
		String[] names = new String[100];
		String[] jusos = new String[100];
		String[] phones = new String[100];
		
		names[0]="홍길동";
		jusos[0]="인천 서구 경서동";
		phones[0]="010-2010-2010";
		names[1]="심청이";
		jusos[1]="인천 부평구 계산동";
		phones[1]="010-3010-3010";
		
		int count=2;
		boolean run = true;
		while (run) {
			System.out.println("----------------------");
			System.out.println("1.주소등록  2.주소출력  0.종료");
			System.out.println("----------------------");
			System.out.println("선택>>");
			String menu = scan.nextLine();

			switch(menu) {
			case "1" : 
				System.out.print("이름>>");
				String name = scan.nextLine();
				System.out.print("주소주~>>");
				String juso = scan.nextLine();
				System.out.print("전화>");
				String phone = scan.nextLine();
				names[count]=name;
				jusos[count]=juso;
				phones[count]=phone;
				count= count+1;
				break;
			case "2" : 
				for(int i=0; i<count; i=i+1) {
				System.out.printf("%s\t%s\t%s\n",names[i],phones[i],jusos[i]);
				}
				break;
			case "0" : System.out.println("프로그램 종룡");
				run=false;
				break;
			default : System.out.println("1~2번을 누르세요.");
					  System.out.println("종료하기는 0번 누르셈");
			
				
				
			
			}//switch
			
			
		}//while
		
	}//run
}//class
