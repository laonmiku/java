package am;

import java.util.Scanner;

public class Sub033 {

	public static void run() {
		
		Scanner  sc = new Scanner(System.in);
		String hello[]=new String[100];
		String mymel[]=new String[100];
		String sinamo[]=new String[100];
		String fomfom[]=new String[100];
		int count=0;
		 
		boolean cute = true;
		while(cute) {
			System.out.println("\n\n*+:｡.ﾟ+*:ꔫ:*﹤　Sanrio　﹥*:ꔫ:*+ﾟ｡.｡:+*\n");
			System.out.println("ꔫ헬로키티ꔫﾟ｡.｡:+*11번♥ꔫ");
			System.out.println("ꔫ마이멜로디ꔫﾟ｡.｡:+*12번♥ꔫ");
			System.out.println("ꔫ시나모롤ꔫﾟ｡.｡:+*13번♥ꔫ");
			System.out.println("ꔫ폼폼푸린ꔫﾟ｡.｡:+*13번♥ꔫ");
			System.out.println("\n*+:｡.ﾟ+*:ꔫ숫자만 누르세용ꔫ:*+ﾟ｡.｡:+*\n");
			String menu = sc.nextLine();
			
			switch(menu) {
			case "00" :
				while(true) { //등록을 계속할수잇음
					System.out.println("헬로키티>");
					String ch = sc.nextLine();
					if(ch=="") {
						System.out.println("입력 끝냅니댕"); 
					break; //공백치면 와일문 밖으로나가서 끝낼수있음
					}hello[count]=ch;
					System.out.println("마이멜로디>");
					String ch2 = sc.nextLine();
					if(ch2=="") {
						System.out.println("입력 끝냅니댕");
					break;
					}mymel[count]=ch2;
					System.out.println("시나모롤>");
					String ch3 = sc.nextLine();
					if(ch3=="") {
						System.out.println("입력 끝냅니댕");
					break;
					}sinamo[count]=ch3;
					System.out.println("폼푸린>");
					String ch4 = sc.nextLine();
					if(ch4=="") {
						System.out.println("입력 끝냅니댕");
					break;
					}fomfom[count]=ch4;
				}
					
					
					
					
					count+=1;
					break;
					
			case "11" :
				System.out.println("\n+:｡.ﾟ+*♥헬로키티♥ﾟ｡.｡:+*\n");
				break;
			case "12" :
				System.out.println("\n+:｡.ﾟ+*♥마이멜로디♥ﾟ｡.｡:+*\n");
				break;
			case "13" :
				System.out.println("\n+:｡.ﾟ+*♥시나모롤♥ﾟ｡.｡:+*\n");
				break;
			case "14" :
				System.out.println("\n+:｡.ﾟ+*♥폼폼푸린♥ﾟ｡.｡:+*\n");
				break;
			case "6" :
				System.out.println("\n꘎♡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━♡꘎\n");
				cute=false;
				break;
			
			default:
				System.out.println(" \n♥♥♥종료하고싶다면 6번♥♥♥\n ");
				
				break;
				
			
			
			
			}
			}
	}//run
}//class
