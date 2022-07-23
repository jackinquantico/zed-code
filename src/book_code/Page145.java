package book_code;

import java.util.Scanner;

public class Page145 {
	public static void main(String args[]) {
		int score = 0;
		char grade = ' ' , opt = '0';
		
		System.out.println("점수를 입력해주세요.");
		
		System.out.print(">>");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.\n",score);
		
		if (score >= 90) {
			grade = 'A';
			if (score >=98)
				opt = '+';
			else if (score < 94)
				opt = '-';
		} else if (score >=80) {
			grade = 'B';
			if (score >= 88)
				opt = '+';
			else if (score < 84)
				opt = '-';
		} else if (score >= 70) {
			grade = 'C';
			if (score >= 78)
				opt = '+';
			else if (score < 74)
				opt = '-';
		} else {
			grade = 'D';
		}
		
		System.out.printf("당신의 성적은 %c%c입니다.",grade,opt);
	}
}
