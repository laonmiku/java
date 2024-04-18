package pm;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub03 {
	public static void run() {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ArrayList<String>names=new ArrayList<>();
		ArrayList<String>jusos=new ArrayList<>();
		names.add("홍길동"); jusos.add("서울");
		names.add("심청이"); jusos.add("부산");
		while(run) {
			System.out.println("*+:｡.ꔫﾟ+*:｡.ﾟ+:ꔫ:*+ﾟ｡.:｡.ﾟ+ꔫ｡:｡.ﾟꔫ:+*");
			System.out.println("1.주소등록 2.이름검색 3.주소목록 4.주소삭제");
			System.out.println("*+:｡.ꔫﾟ+*:｡.ﾟ+:ꔫ:*+ﾟ｡.:｡.ﾟ+ꔫ｡:｡.ﾟꔫ:+*");
			System.out.println("\n번호를 누르숑ꔫ");
			String menu = scan.nextLine();
			
			switch(menu) {
			case "0" :
				run=false;
				System.out.println("+ﾟ｡.ꔫ프로그램 종료ꔫ｡.ﾟ+");
				break;
				
			case "1" :
				System.out.println("이름을 누르숑ꔫ");
				names.add(scan.nextLine());
				System.out.println("주소를 누르숑ꔫ");
				jusos.add(scan.nextLine());
				System.out.println("+ﾟ｡.ꔫ수고했숑ꔫ｡.ﾟ+\n");
				break;
				
				
			case "2" :
				while(true) {
				System.out.println("찾을 이름을 입력하숑ꔫ");
				System.out.println("나가려면 엔터키를 누르숑ꔫ");
				String sname=scan.nextLine();
				if(sname=="") {
					System.out.println("+ﾟ｡.ꔫ검색끝냈숑ꔫ｡.ﾟ+\n\n");
					break;
				}
				
				boolean find = false;
				for(int i=0;i<names.size();i++) {
					String name=names.get(i);
					if(sname.equals(name)) {
						System.out.println("+ﾟ｡.ꔫ"+sname+"은(는) 있숑ꔫ｡.ﾟ+");
						System.out.println("+ﾟ｡.ꔫ 주소 ꔫ "+ jusos.get(i)+" ꔫ｡.ﾟ+\n");
						find=true;
					}
				}
				if(!find)//(find==false)
					{
					System.out.println("+ﾟ｡.ꔫ"+sname+"은(는) 없숑ꔫ｡.ﾟ+\n");
					}
					
				}//while
				break;
				
			case "3" :
				System.out.println("+:｡.ﾟ+:｡.ﾟ+::+ﾟ｡.:｡.ﾟ+｡:｡.ﾟ:+");
				for(int i=0 ; i<names.size();i++) {
					System.out.printf("%s\t%s\n",names.get(i),jusos.get(i));
				}
				System.out.println("+:｡.ﾟ+:｡.ﾟ+::+ﾟ｡.:｡.ﾟ+｡:｡.ﾟ:+");
				System.out.println(jusos.size()+"명이 있숑ꔫ \n");
				break;
				
			case "4" :
				System.out.println("지울 이름을 입력하숑ꔫ");
				String rname = scan.nextLine();
				boolean find= false;
				for (int i=0; i<names.size();i++) {
					String name = names.get(i);
					if(rname.equals(name)) {
						System.out.println("+ﾟ｡.ꔫ 주소 ꔫ "+ jusos.get(i)+" ꔫ｡.ﾟ+\n");
						find=true;
						System.out.println("ꔫ삭제 진짜 할꺼숑?ꔫ   넹/yesꔫ");
						String answer = scan.nextLine();
						if(answer.equals("넹") || answer.equals("yes")) {
							names.remove(i);
							jusos.remove(i);
							System.out.println("삭제했숑ꔫ\n");
							break;
						   }
						else {
							System.out.println("ꔫ삭제 안 했숑ꔫ\n");
						   }
					}
				}
				break;
				
			default :
				System.out.println("+ﾟ｡.ꔫ0~4번을 누르숑ꔫ｡.ﾟ+");
			}//switch
		}//while
	}//run
}
