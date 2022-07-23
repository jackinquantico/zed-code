package exception_study;

import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		int answer = (int)(Math.random()*100) + 1;
		int input = 0;
		int count = 0;
		
		System.out.println(answer);
		
		do {
			count++; // 시도 횟수를 먼저 세야 함.

			System.out.println("1~100 사이의 숫자를 입력하세요.");
			
			System.out.print(">> ");
		
			try {				
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
			} catch (Exception e) {
				System.out.println("유효하지 않은 값입니다. 값을 다시 입력해주세요.");
				continue;
			}
			
			//만약 틀린 횟수를 세고 싶다면 if문 내에
			if (answer > input){
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			}else {
				System.out.println("정답입니다.");
				System.out.printf("시도 횟수는 %d번입니다.", count);
				break;
			}
		} while (true);
	}
}
