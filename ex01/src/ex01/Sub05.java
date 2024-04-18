package ex01;

public class Sub05 {
	public static void run() {
		//제어문 (if switch)
		int score=67;
		String grade = "";
		if(score >90) {
			if(score>=95) {
				grade="A+";
			}
			else {
				grade="A-";
			}
		}
		else if(score >80) {
			if(score>=85) {
				grade="B+";
			}
			else {
				grade="B-";
			}
		}
		else if(score >70) {
			if(score>=75) {
				grade="C+";
			}
			else {
				grade="C-";
			}
		}
		else if(score >60) {
			if(score>=65) {
				grade="D+";
			}
			else {
				grade="D-";
			}
		}
		else {
			grade="F";
		}
		System.out.println
		(score+"점의 학점은 "+grade+"입니다");
		
		//switch문
		int time=6;
		switch(time) {
			case 6 : 
				System.out.println("기상");
				break;
			case 9 :
				System.out.println("출근");
				break;
			case 12 :
				System.out.println("점심");
				break;
			case 18 :
				System.out.println("퇴근");
				break;	
			default:
				System.out.println("...");
			
		}
	}
}
