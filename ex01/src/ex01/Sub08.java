package ex01;

public class Sub08 {

	public static void run() {
//		int[] scores =new int[] {90,80,75,100,99,11,66,78,100};
//		for(int i=0; i<scores.length;i++) {
//			System.out.println(scores[i]);
//		}
		
		int[] no = new int[] {1,2,3};
		String[] name = new String[] {"홍길동", "심청이", "강감찬"};
		String[] address = new String[] {"인천","서울","부산"};
		
		for(int i=0; i<no.length ;i++){
			System.out.println(no[i]+"\t"+name[i]+"\t"+address[i]);
			System.out.println("==========================");
		}
		
		int[] kor = new int[] {90,88,92};
		int[] eng = new int[] {86,92,76};
		int[] mat = new int[] {99,87,56};
		
		for(int i=0; i<no.length;i++) {
			int tot = kor[i] + eng[i] + mat[i];
			
			double avg = tot/3.;
			
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
					
					
			
//			System.out.println(no[i]+"\t"+name[i]+"\t"+tot +"\t"+avg);
//			
			System.out.printf
				("%d \t %s \t %d \t %.3f \t %s \n", no[i],name[i], tot, avg, grade);
		}
	}
}

