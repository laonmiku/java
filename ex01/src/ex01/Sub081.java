package ex01;

import java.util.Scanner;

public class Sub081 {
	public static void run() {
		Scanner s=new Scanner(System.in);
		
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
	}
	
}
