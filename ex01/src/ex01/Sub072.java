package ex01;

import java.util.Scanner;

public class Sub072 {
	public static void run() {
		Scanner s = new Scanner(System.in);
		
	 int coffee = 10; 
	 int money = 300;  
	     
	 while (money > 0) {
	       System.out.println("돈을 받았으니 커피를 판매합니다.");
	        coffee=coffee-1;
	       
	       if (coffee == 0) {
	          System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
	           break;}
	       }
	       System.out.println("while문 빠져 나옴!");
						
		
		
		}
		
	
		
	}
	

