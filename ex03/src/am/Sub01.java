package am;

import java.util.*;

public class Sub01 {
	public static void run() {
		boolean run = true;
		Scanner scan = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> kors = new ArrayList<Integer>();
		ArrayList<Integer> engs = new ArrayList<>();
		ArrayList<Integer> mats = new ArrayList<>();
		names.add("홍길동"); kors.add(80);engs.add(77);mats.add(82);
		names.add("강감찬"); kors.add(90);engs.add(87);mats.add(83);
		int count=2;
		int sum_kor=0;
		int sum_eng=0;
		int sum_mat=0;
		while(run) {
			System.out.println("\n==============================================");
			System.out.println(" 1.성적등록 2.성적목록 3.성적검색 4.성적삭제 0.종료하기");
			System.out.println("==============================================\n");
			System.out.println("번호를 입력>>");
			String menu = scan.nextLine();
			
			
			switch(menu) {
			case "0":
				System.out.println("프로그램 종료");
				run=false;
				break;
			case "1":
				System.out.println("이름>>");
				names.add(scan.nextLine());
				System.out.println("국어점수>>");
				kors.add(Integer.parseInt(scan.nextLine()));
				System.out.println("영어점수>>");
				engs.add(Integer.parseInt(scan.nextLine()));
				System.out.println("수학점수>>");
				mats.add(Integer.parseInt(scan.nextLine()));
				System.out.println("정보등록 완료");
				break;
			case "2":
				System.out.println("----------------------------------------------");
				System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println("----------------------------------------------");
				for(int i=0; i<names.size();i++) {
					int tot = kors.get(i)+ engs.get(i)+mats.get(i);
					double avg = tot/3.;
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",
							names.get(i),kors.get(i),engs.get(i),mats.get(i),tot,avg);
					sum_kor+=kors.get(i);
					sum_eng+=engs.get(i);
					sum_mat+=mats.get(i);
					
				}
				System.out.println("----------------------------------------------");
				System.out.printf("과목당평균\t%.2f\t%.2f\t%.2f\n",
						(double)sum_kor/(double)kors.size(),(double)sum_eng/names.size(),sum_mat/(double)names.size());
				System.out.println("----------------------------------------------");
				System.out.println(names.size()+"명이 존재함");
				System.out.println("----------------------------------------------");
				break;
			case "3":
				System.out.println("검색할 이름>>");
				String sname = scan.nextLine();
				
			boolean find = false;
			for(int i=0; i<names.size();i++) {
					if(names.get(i).equals(sname)) {
					System.out.println("----------------------------------------------");
					System.out.println(names.get(i)+"님은 존재합니다.");
					System.out.println("----------------------------------------------");
						System.out.println("국어\t영어\t수학\t총점\t평균");
						int tot = kors.get(i)+ engs.get(i)+mats.get(i);
						double avg = tot/3.;
						System.out.printf("%d\t%d\t%d\t%d\t%.2f",
								kors.get(i),engs.get(i),mats.get(i),tot,avg);
						find=true;
					}
					}
				if(!find) {
					System.out.println("----------------------------------------------");
					System.out.println(sname+"님은 존재하지 않습니다");
				}	
				
//				for(int i=0; i<names.size();i++) {
//		               if(names.get(i).equals(sname)) {
//		                  System.out.println(names.get(i)+"님은 존재합니다.");
//		                  System.out.println("----------------------------------------------");
//		                  System.out.println("국어\t영어\t수학\t총점\t평균");
//		                  int tot = kors.get(i)+ engs.get(i)+mats.get(i);
//		                  double avg = tot/3.;
//		                  System.out.printf("%d\t%d\t%d\t%d\t%.2f\n",
//		                        kors.get(i),engs.get(i),mats.get(i),tot,avg);
//		               }
//		               else{
//		                  System.out.println(sname+"존재하지 않습니다.");
//		                  }
//		          }//오류남띠예,,
				
		                  
				
				
				break;
			case "4":
				System.out.println("삭제할 이름>>");
				String rname = scan.nextLine();
				
				boolean rfind = false;
				for(int i=0; i<names.size();i++) {
					if(names.get(i).equals(rname)) {
						System.out.println("----------------------------------------------");
						System.out.println(names.get(i)+"님은 존재합니다.");
						System.out.println("----------------------------------------------");
						System.out.println("삭제하시겠습니까?\n>yes< 혹은 >네< 를 입력하세요\n");
						System.out.println("되돌아가기는 엔터를 누르세요<<\n");
						String ans = scan.nextLine();
						System.out.println("----------------------------------------------");
						if(ans.equals("yes") || ans.equals("네")) {
							names.remove(i);
							kors.remove(i);
							engs.remove(i);
							mats.remove(i);
							
							System.out.println("삭제 완료");
							System.out.println("----------------------------------------------");
						}
						else {
							System.out.println("메뉴로.. ");
							System.out.println("----------------------------------------------");
						}
						rfind=true;
					}
					}
				if(!rfind) {
					System.out.println("----------------------------------------------");
					System.out.println(rname+"님은 존재하지 않습니다");
				}	
				break;
			default:
				System.out.println("0~4번을 선택");
			
			}//switch
			
		}//while
		
	}//run
}//
