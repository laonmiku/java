package am;

public class Score {
//클래스의 필드,,아이템,,속성,,=name,kor,eng,mat
	String name;
	int kor;
	int eng;
	int mat;
					
//생성자 public Score() {}
	public Score() {
		
	}
					
	public Score(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}



//method,,
	public int total() {
		int total = kor+eng+mat;
		return total; //void는 리턴이 없을대만 쓸수잇어서 퍼블릭보이드를 퍼블릭인트로,,
	}
	public double avg() {
		return (kor+eng+mat)/3.; //값을 구하고 리턴해도되지만 리턴할때 정해줘도 ㅇㅋ
	}
	public void print() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n"
				,name,kor,eng,mat,total(),avg(),grade()); //토탈이랑 avg는 메소드니까 메소드를 실행!!avg()
	}
	public String grade() {
		String grade="F";
		if(avg()>=90) {
			if (avg()>=95) {
				grade="A+";
			}
			else {
				grade="A-";
			}
		}
		else if(avg()>=80) {	
			if(avg()>=85) {
				grade="B+";
			}
			else {
				grade="B";
			}
		}
		else if(avg()>=70) {	
			if(avg()>=75) {
				grade="C+";
			}
			else {
				grade="C";
			}
		}
		else{
			grade="F";
		}
	
		return grade;
	}
	
}
