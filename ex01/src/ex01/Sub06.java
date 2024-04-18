package ex01;

public class Sub06 {
	public static void run() {
		//반복문(for while)
		//for
		int sum=0;
		for(int i =1; i<=100; i=i+1) { //i에 1씩 증가해서 저장
//			System.out.println(i);
			sum = sum+i; //i에 대한 합계를 sum에 저장
		}
		System.out.println("1~100까지 합계 : "+sum);
		
	    sum =0; //앞에서 선언했으니 인트는 빼줌,,
		for(int i =1; i<=100; i=i+2) { //i에 2씩 증가해서 저장
//			System.out.println(i);
			sum = sum+i; //i에 대한 합계를 sum에 저장
		}
		System.out.println("1~100까지 홀수의 합계 : "+sum);
		sum =0; 
		for(int i =2; i<=100; i=i+2) { //i 인트는 포문안에서만쓸수있는거라 여러번해도 ㅇㅋ
//			System.out.println(i);
			sum = sum+i; //i에 대한 합계를 sum에 저장
		}
		System.out.println("1~100까지 짝수의 합계 : "+sum);
		
		//while
		int i = 1;
		sum = 0 ;
		while(i<=100) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
		
		i = 1;
		sum = 0 ;
		while(i<=100) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println("1~100까지 홀수의 합 :"+sum);
		i = 2;
		sum = 0 ;
		while(i<=100) {
			sum=sum+i;
			i=i+2;
		}
		System.out.println("1~100까지 짝수의 합 :"+sum);
	}
}
