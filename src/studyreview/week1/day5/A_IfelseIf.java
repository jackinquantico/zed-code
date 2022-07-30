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
	
	// if else + 반복문 결합
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		
		while (true) {
			System.out.print("성적을 입력하세요 : ");
			score = sc.nextInt();
			sc.nextLine();
			
			if ((0 <= score) && (score <= 100)) {
				if (score >= 90) {
					grade = "A";
					break;
				} else if (score >= 80) {
					grade = "B";
					break;
				} else if (score >= 70) {
					grade = "C";
				} else {
					grade = "D";
					break;
				}			
			} else {
				System.out.println("유효하지 않은 숫자입니다.");
				continue;
			}
		}
		
		System.out.printf("당신의 점수는 %d이고, 성적은 %s등급입니다.\n", score, grade);
		
	}

	// 성적을 세부적으로 나누기
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		int score = 0;
		String grade = "";
		String plus = "";
		
		while (true) {
			System.out.print("성적을 입력하세요 : ");
			score = sc.nextInt();
			sc.nextLine();
			
			if ((0 <= score) && (score <= 100)) {
				if (score >= 90) {
					grade = "A";
					if (score % 10 > 6) {
						grade += "+";					
					} else if (score % 10 > 3) {
						grade += "0";
					} else {
						grade += "-";
					}
					break;
				} else if (score >= 80) {
					grade = "B";
					if (score % 10 > 6) {
						grade += "+";					
					} else if (score % 10 > 3) {
						grade += "0";
					} else {
						grade += "-";
					}
					break;
				} else if (score >= 70) {
					grade = "C";
					if (score % 10 > 6) {
						grade += "+";					
					} else if (score % 10 > 3) {
						grade += "0";
					} else {
						grade += "-";
					}
				} else if (score >= 60) {
					grade = "D";
					if (score % 10 > 6) {
						grade += "+";					
					} else if (score % 10 > 3) {
						grade += "0";
					} else {
						grade += "-";
					}
					break;
				} else {
					grade = "F";
					break;
				}
			} else {
				System.out.println("유효하지 않은 숫자입니다.");
				continue;
			}
		}
		
		System.out.printf("당신의 점수는 %d이고, 성적은 %s등급입니다.\n", score, grade);
		
	}
	
}
