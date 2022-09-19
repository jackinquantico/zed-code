package studyreview.week1.day5;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class C_Practice {

	// 국영수 점수 입력 받아서 합격 여부 처리
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + eng + math;
		float average = (int)(sum / 3f * 100 + 0.5f) / 100f;
		// Math.round() 사용하지 않고 소수점 아래 세번째 자리에서 반올림하기
		// float average1 = Math.round(sum / 3f * 100)/100f;

		
		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + average);
		
		if ((kor >= 40) && (eng >= 40) && (math >= 40) && (average >= 60)) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	// 두 수 비교하기
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		String src = sc.nextLine();
		
		String[] num = src.split(" ");
		
		int num1 = Integer.parseInt(num[0]);
		int num2 = Integer.parseInt(num[1]);
		
		if (num1 > num2) {
			System.out.println(">");
		} else if (num1 < num2) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		
	}
	
	// 시간 계산 - 오답
	public void method3() {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		sc.nextLine();
		int time = sc.nextInt();
		sc.nextLine();
		
		if (min + time < 60) {
			System.out.println(hour + " " + (min+time));
		} else if (min + time >= 60){
			
			if (hour < 23) {
				hour += (min+time) / 60;
				int resultMin = (min+time) % 60;
				System.out.println(hour + " " + resultMin);
				
			} else if (hour >= 23) {
				hour = 0;
				int resultMin = (min+time) - 60;
				System.out.println(hour + " " + resultMin);
			}
		}
		
		
	}

	// 시간을 분으로 바꿔서 재시도
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
        int hourtime = hour * 60;
        
        int resulthour = (hourtime + min + time) / 60;
        int resultmin = (hourtime + min + time) % 60;
        
        if (resulthour >= 24) {
        	resulthour -= 24;
        }
        System.out.println(resulthour + " " + resultmin);
        
	}

	// 주사위 문제
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int price = 0;
		
		if ((a == b) && (b == c)) {
			price = 10000 + a * 1000;
		} else if ((a==b) || (b==c) || (a==c)) {
			if (a == b) {
				price = 1000 + a * 100;
			} else if (b == c) {
				price = 1000 + b * 100;
			} else if (a==c) {
				price = 1000 + a * 100;
			}
		} else {
			price = Math.max(a,  Math.max(b, c));
		}
		
		System.out.println(price);
		
		
	}
	
	// 나머지
	public void method6() {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt() % 42;
		}
		
		

			
	}
}
