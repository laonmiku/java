package ex01;

import java.util.Scanner;

public class Sub071 {
	public static void run() {
		Scanner s = new Scanner(System.in);
		
	boolean pick = true;
	while(pick) {
		System.out.println("1.밥을 먹으러간다");
		System.out.println("2.영화를 보러간다");
		System.out.println("3.산책을 하러간다");
		System.out.println("숫자를 입력>-<");
			String menu = s.nextLine();
			
			switch(menu) {
			case "1" : 
				System.out.println("맛있겠다!");
				break;
			case "2" : 
				System.out.println("재밌겠다!");
				break;
			case "3" : 
				System.out.println("날씨좋다!");
				break;
			case "0" :
				System.out.println(" 끗~");
				pick=false;
				break;
				
			default:
				System.out.println("끝내기는 0번~!");
				
						
		
		
		}
		
	}
		
	}
	
}
