package am;

import java.util.Scanner;

public class Sub03 {
	public static void run() {
		System.out.println("\n=================================");
		System.out.println("\t☎주소관리☎");
		
		Scanner scan=new Scanner(System.in);
		String names[]=new String[100];
		String jusos[]=new String[100];
		String phones[]=new String[100];
		int count=0;
		boolean run=true;
		while (run) {
			System.out.println("=================================");
			System.out.println("    1.주소등록  2.주소현황  0.종료");
			System.out.println("=================================");
			System.out.println("번호를 누르숑>");
			String menu = scan.nextLine();
			switch(menu) {
			case "1" :
				
				while(true) { //등록을 계속할수잇음
				System.out.println("이름을 누르숑>");
				String name = scan.nextLine();
				if(name=="") {
					System.out.println("입력 끝냅니댕"); 
				break; //공백치면 와일문 밖으로나가서 끝낼수있음
				}
				System.out.println("주소를 누르숑>");
				String juso = scan.nextLine();
				if(juso=="") {
					System.out.println("입력 끝냅니댕");
				break;
				}
				System.out.println("폰번을 누르숑>");
				String phone = scan.nextLine();
				if(phone=="") {
					System.out.println("입력 끝냅니댕");
				break;
				}
				names[count]=name;
				jusos[count]=juso;
				phones[count]=phone;
				count+=1;
				
				}//while
				break;
				
			case "2" :
				System.out.println("---------------------------------");
				if(count==0) {
					System.out.println("등록된게 없숑<");
				}
				else {
					for(int i=0; i<count; i++) {
						System.out.printf("%s\t%s\t%s\n",names[i],jusos[i],phones[i]);
					}//for	
					System.out.println("---------------------------------");
					System.out.println(count+"명이 있숑☎");
				}//else
				break;
				
			case "0" :
				run=false;
				break;
				
			default:
					System.out.println("0~2번을  누르숑!!");
				
			}//switch
			
		}//while
		System.out.println("\n프로그램끝났숑 ♡ヾ(๑❛ ▿ ◠๑ )");
		
	}
}
