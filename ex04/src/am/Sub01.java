package am;

import java.util.*;

public class Sub01 {
	   public static void run() {
		      boolean run=true;
		      ArrayList<Car>cars= new ArrayList<>();
    		  Scanner scan=new Scanner(System.in);
    		  
		      Car car=new Car(1,"현대","그랜저","검정",20000,"2020-03");
		      cars.add(car);
		      car=new Car(2,"쌍용","티볼리","파랑",60000,"2019-06");
		      cars.add(car);
		      car=new Car(3,"기아ㅏ","k7","흰색",120000,"2021-04");
		      cars.add(car);
		      
		      while(run) {
		         System.out.println("--------------------------------------------");
		         System.out.println("  1.차량등록|2.차량조회|3.차량목록|4.차량삭제|0.종료");
		         System.out.println("--------------------------------------------");
		         System.out.print("선택>");
		         String menu=scan.nextLine();
		         switch(menu) {
		         case "1":
		        	 int next =cars.size()+1;
		        	 System.out.print("차량번호 >>"+next);
		        	 System.out.println("회사>> ");
		        	 String company=scan.nextLine();
		        	 car.setCompany(company);
		        	 System.out.print("종류>> ");
		        	 String model=scan.nextLine();
		        	 car.setModel(model);
		        	 System.out.print("색상>> ");
		        	 String color=scan.nextLine();
		        	 car.setColor(color);
		        	 System.out.print("주행거리>> ");
		        	 int distance=Integer.parseInt(scan.nextLine());
		        	 car.setDistance(distance);
		        	 System.out.print("연식>> ");
		        	 String date=scan.nextLine();
		        	 car.setDate(date);
		        	 cars.add(car);
		        	 System.out.println(car.toString()+"등록완료!");
		        	 System.out.println("등록된 데이터"+cars.size()+"개");
		        	 break;
		        	 
		         case "2":
		        	 while(true) {
			        	 System.out.println("조회할 번호>>");
			        	 String sno=scan.nextLine();
			        	 if(sno=="") {break;}
			        	 boolean find=false;
			        	 for(Car c:cars) {
			        		 if(Integer.parseInt(sno)==c.getNo()) {
			        			 System.out.printf("%d번\t%s\t%s\t%s\t%,d\t%s\n",
				        				 	c.getNo(),c.getCompany(),c.getModel(),c.getColor(),
				        				 	c.getDistance(),c.getDate());
			        			 find = true;
			        		 }
			        	 }
			        	 if(!find) System.out.println(sno+"데이터가 없습니다");
		        	 }
		            break;
		            
		         case "3":
		        	 for(Car c: cars) {
		        		 System.out.printf("%d번\t%s\t%s\t%s\t%,d\t%s\n",
		        				 	c.getNo(),c.getCompany(),c.getModel(),c.getColor(),
		        				 	c.getDistance(),c.getDate());
		        	 }
		        	 System.out.println("등록된 데이터 : "+cars.size()+"개");
		            break;
		            
		         case "4":
		        	 System.out.println("삭제할 번호>>");
		        	 String sno=scan.nextLine();
		        	 if(sno=="") {break;}
		        	 boolean find=false;
		        	 for(Car c:cars) {
		        		 if(Integer.parseInt(sno)==c.getNo()) {
		        			 System.out.printf("%d번\t%s\t%s\t%s\t%,d\t%s\n",
			        				 	c.getNo(),c.getCompany(),c.getModel(),c.getColor(),
			        				 	c.getDistance(),c.getDate());
		        			 find = true;
		        			 System.out.println("삭제하시려면 >>(y)");
		        			 String ans=scan.nextLine();
		        			 if(ans.equals("y") || ans.equals("Y")) {
		        				 cars.remove(c);
		        				 System.out.println("삭제완료!");
		        			 }
		        			 else {
		        				 System.out.println("삭제취소!");
		        			 }
		        			break;
		        		 }
		        	 }
		        	 if(!find) System.out.println(sno+"데이터가 없습니다");
		        	 break;
		            
		         case "0":
		            System.out.println("프로그램을 종료합니다.");
		            run=false;
		            break;
		            
		         default:
		            System.out.println("0~4메뉴를 선택하세요!");
		         }
		      }//while
		   }//run
}
