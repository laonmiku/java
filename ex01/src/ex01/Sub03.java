package ex01;

public class Sub03 {
	public static void run() {
		//정수타입 (소수점이 없는 수)
		int num1 = 10;
		
		//실수타입 (플롯(4bite),더블(8bite))
		float num2 = 11.5f; 
		double num3 = 12.5;
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		System.out.println("num3=" + num3);
		
		//형변환(정수 -> 실수)
//		num2 = num1;
//		System.out.println("num2=" + num2);
//		num3=num1;
//		System.out.println("num3=" + num3);
		//형변환(실수 -> 정수)
		num1=(int)num2;
		System.out.println("num1=" + num1);
		num1=(int)num3;
		System.out.println("num1=" + num1);
		//강제형변환()시켜서 소수점자리는 다 잘라버림
		
		
		//문자타입(캐릭터,스트링)
		char str1='A'; //작은따옴표는 한글자!
		String str2 = "홍길동";
		
		System.out.println("str1=" + str1);
		System.out.println("str2=" + str2);
		
		//불린타입
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println("bool1=" + bool1);
		System.out.println("bool2=" + bool2);
	}
	
	
}
