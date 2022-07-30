package studyreview.week1.day5;

import java.util.Scanner;

public class A_IfelseIf {
	
	// 과제 - if else 만 사용
	public void method1() {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		sc.nextLine();
		
		String grade = "";
		
		if ((0 <= score) && (score <= 100)) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else {
				grade = "D";
			}			
		} else {
			System.out.println("유효하지 않은 숫자입니다.");
			return;
		}
		
		System.out.printf("당신의 점수는 %d이고, 성적은 %s등급입니다.\n", score, grade);
	}
	
	// if else + 
}
