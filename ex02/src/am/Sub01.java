package am;

import java.util.Scanner;

public class Sub01 {
	public static void run() {
		
		System.out.println("성적관리프로그램");
		boolean stop = false;
		Scanner scan = new Scanner(System.in);
		String[] names = new String[100];
		int [] kors = new int [100];
		int [] engs = new int [100];
		int [] mats = new int [100];		
		names[0] = "홍길동";kors[0]=98;engs[0]=88;mats[0]=99;
		names[1] = "심청이";kors[1]=67;engs[1]=82;mats[1]=69;
		int count=2;
		
		while(!stop) {
			System.out.println("\n===========================");
			System.out.println("1.성적등록  2.성적출력  0.종료");
			System.out.println("============================");
			System.out.println("선택하숑>>");
			String menu = scan.nextLine();
			switch (menu) {
			case "1": 
				System.out.print("이름을 적으숑>");
				String name= scan.nextLine();
				System.out.print("국어성적 적으숑>");
				int kor= Integer.parseInt(scan.nextLine());
				System.out.print("영어성적 적으숑>");
				int eng= Integer.parseInt(scan.nextLine());
				System.out.print("수학성적 적으숑>");
				int mat= Integer.parseInt(scan.nextLine());
				names[count] = name;
				kors[count] = kor;
				engs[count] = eng;
				mats[count] = mat;
				count+=1;
				System.out.println("입력은 끝났숑^ㅁ^bb");
				break;
			case "2":
				System.out.println("---------------------------------------------------");
				System.out.println("이름    국어     영어     수학      총점      평균    학점");
				System.out.println("---------------------------------------------------");
				int sum_kor=0;int sum_eng=0; int sum_mat=0;
				for(int i =0; i<count; i++) {
					int tot=kors[i]+engs[i]+mats[i];
					double avg= tot/3.;
					String grade="";
					if(avg>=90) {
						if (avg>=95) {
							grade="A+";
						}
						else {
							grade="A-";
						}
					}
					else if(avg>=80) {
						if (avg>=85) {
							grade="B+";
						}
						else {
							grade="B-";
						}
					}
					else if(avg>=70) {
						if (avg>=75) {
							grade="C+";
						}
						   else {
							grade="C-";
						}
					}
					else if(avg>=60) {
						if (avg>=65) {
							grade="D+";
						}
						   else {
							grade="D-";
						}
					}
					else {
						grade="F";
					}
					
					
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.3f\t%s\n",
								names[i],kors[i],engs[i],mats[i],tot,avg,grade);
					sum_kor=sum_kor+kors[i];
					sum_eng=sum_eng+engs[i];
					sum_mat=sum_mat+mats[i];
					
				}
				System.out.println("---------------------------------------------------");
				System.out.printf("과목평균  %.2f\t%.2f\t%.2f\n",
						sum_kor/(float)count, sum_eng/(float)count, sum_mat/(float)count);
				System.out.println("---------------------------------------------------");
				System.out.println(count+"명의 학생이 있숑");
				break;
			case "0":
				stop=true;
				System.out.println("☞프로그램 종료합니다☜");
				break;
				
			default : System.out.println("☞0~2번☜을 눌러주세요");
			
			}//switch
			
		}//while
		
	}//run
}//class
