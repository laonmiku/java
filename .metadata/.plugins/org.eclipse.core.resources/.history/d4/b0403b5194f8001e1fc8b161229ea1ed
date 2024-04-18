package am;

import java.util.ArrayList;
import java.util.Scanner;

public class Sub02 {
	public static void run() {
		boolean run=true;
		Scanner scan=new Scanner(System.in);
		ArrayList<Juso>jusos=new ArrayList<>();
		Juso juso1=new Juso("홍길동","010-1010-1010","인천");
		jusos.add(juso1);
		juso1=new Juso("심청이","010-1010-2222","서울");
		jusos.add(juso1);
		juso1=new Juso("강감찬","010-1010-3333","부산");
		jusos.add(juso1);
		
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.주소등록 2.주소조회 3.주소목록 4.주소삭제 0.종료");
			System.out.println("---------------------------------------");
			System.out.println("선택>>");
			String menu = scan.nextLine();
			switch(menu) {
			case "1"://주소등록
				Juso juso=new Juso();
				System.out.println("이름>>");
				String name=scan.nextLine();
				juso.setName(name);
				System.out.println("주소>>");
				String adress=scan.nextLine();
				juso.setAddress(adress);
				System.out.println("전화>>");
				String phone=scan.nextLine();
				juso.setPhone(phone);
				jusos.add(juso);
				System.out.println(juso.toString()+"\n등록완료!");
				System.out.println("등록된데이터 :"+jusos.size()+"개");
				break;
			case "2"://주소조회
				while(true) {
					System.out.println("조회할 이름>>");
					String sname=scan.nextLine();
					if(sname=="") {break;}
					boolean find =false;
					for(Juso j:jusos) {
						if(sname.equals(j.getName())) {//이름을 찾은경우
							System.out.println("주소 : "+j.getAddress());
							System.out.println("번호 : "+j.getPhone());
							find=true;
						}
					}
					if(find==false) {System.out.println(sname+"데이터가 존재하지 않습니다.");}
				}	
				break;
			case "3"://주소목록
				for(Juso j:jusos) {
					System.out.printf("%s\t%s\t%s\n",j.getName(),j.getPhone(),j.getPhone());
				}
				System.out.println("등록된 데이터 :"+jusos.size()+"개");
				break;
			case "4"://주소삭제
				System.out.println("삭제할 이름>>");
				String sname=scan.nextLine();
				boolean find =false;
				for(Juso j:jusos) {
					if(sname.equals(j.getName())) {//이름을 찾은경우
						System.out.println("주소 : "+j.getAddress());
						System.out.println("번호 : "+j.getPhone());
						find=true;
						System.out.println("삭제하실래요(y)?");
						String ans =scan.nextLine();
						if(ans.equals("y") || ans.equals("Y")) {
							jusos.remove(j); //fo문에 오브젝트j가져옴
							System.out.println("삭제완료!");
						}
						else {
							System.out.println("삭제취소");
						}
						break;//중요함!
					}
				}
				if(find==false) {System.out.println(sname+"데이터가 존재하지 않습니다.");}
				break;
			case "0":
				System.out.println("프로그램 종료");
				run=false;
				break;
			default:
				System.out.println("0~4번을 누르세요");
			}
			
		}//while
	}
}
