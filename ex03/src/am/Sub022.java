package am;

import java.util.ArrayList;

public class Sub022 {

	public static void run() {
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student("100","홍길동","인천","010-0100-1111"));
		students.add(new Student("101","강감찬","서울","010-0100-2222"));
		students.add(new Student("102","이순신","부산","010-0100-3333"));
		
		for(Student s:students) {
			s.print();
		}
		//아래위똑같은거임,,
		System.out.println("----------------------------");
		for(int i=0;i<students.size();i++) {
			Student s=students.get(i);
			s.print();
		}
		
	}
	
}