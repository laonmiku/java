package am;

public class Sub02 {
	public static void run() {
		System.out.println("클래스란?");
		System.out.println("-----------------------------------------");
		
		Student s1= new Student();//생성자1
		s1.no="100";
		s1.name="홍길동";
		s1.address="인천";
		s1.phone="010-0000-1111";
		s1.print();
		
		System.out.println("-----------------------------------------");
		
		Student s2=new Student("101","이순신");//생성자2
		//주소랑 폰번은 null로뜸 만약 주고싶으면,,,아래처럼
		s2.address="서울";
		
		s2.print();
		
		System.out.println("-----------------------------------------");
		
		//Student s3=new Student ();
		Student s3=new Student ("103","강감찬","부산","010-0000-3333"); //생성자3
		s3.print();
		
		
	}
}
