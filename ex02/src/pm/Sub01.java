package pm;

import java.util.*;

public class Sub01 {
	public static void run() {
		Scanner scan=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<>();
		names.add("홍길동"); //넣어줄때 add
		names.add("심청이");
		names.add("강감찬");
		names.add("성춘향");
		names.add("이몽룡");
		
		names.remove(1); //삭제할때 remove(번호)
	
		for(int i=0;i<names.size();i++ ) {
			String name = names.get(i);
			System.out.println(name); //데이터 전체출력
		
		}//for
		
		
		
		//입력한 데이터가 있는지 조회하기
		while(true) {
		System.out.print("검색할 이름을 입력하숑");
		String sname=scan.nextLine();
		  if(sname=="") {
	            System.out.println("검색을 종료합니다.");
	            break;
	         }
	     boolean find = false;
	         
		for(int i=0;i<names.size();i++) {
			String name=names.get(i);
			
			if (sname.equals(name)) {
				find=true;//찾았으니까 트루로,,,
				System.out.println("존재합니다람지"); 
				
			}//if
		}//for
		if(find==false) {
			System.out.println("존재하지않습니다람지"); 
			}//if
	}//while?
	}//run
}

