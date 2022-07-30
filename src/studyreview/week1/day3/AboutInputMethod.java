package studyreview.week1.day3;

import java.util.Scanner;

public class AboutInputMethod {

	public static void main(String[] args) {
		method1();
	}
	
	public void inputTest6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 길이를 입력하세요 :");
		
		double width = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("세로 길이를 입력하세요 :");
		
		double height = sc.nextDouble();
		sc.nextLine();
		
		System.out.println();
		
		System.out.println("사각형의 면적 : " + (width * height));
		System.out.println("사각형의 둘레 : " + (width + height) * 2);
		
		
		
		/*
		 * 키보드로 가로, 세로 값을 실수형으로 입력 받아서
		 * 사각형의 면적과 둘레를 출력해주세요
		 * 
		 * 힌트
		 * 사각형의 면적 = 세로 * 가로
		 * 사각형의 둘레 = 2 * (세로 + 가로)
		 * 
		 * 실행 예시
		 * 가로 길이를 입력하세요 :
		 * 세로 길이를 입력하세요 :
		 * 
		 * 사각형의 면적 : 
		 * 사각형의 둘레 :
		 */
	}
	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기를 입력하세요 : ");
		int arrLength = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[arrLength];
		
		for (int i = 0; i < arrLength; i++) {
			System.out.printf("int[%d] = %d\n", i, i+1);
		}
	}
}















