package studyreview.week2.day2;

import java.util.Arrays;
import java.util.Scanner;

public class A_Array {

	public void method10() {
		
		/*
		 * 좋아하는 과일의 개수를 입력받아 
		 * 그만큼 반복을 돌리면서 과일명을 입력받기 -> 입력받을 때마다 문자열 배열에 담아서 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좋아하는 과일의 개수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] fruit = new String[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("과일 이름 입력 : ");
			fruit[i] = sc.nextLine();
		}
		
		System.out.println(Arrays.toString(fruit));
	}
	
	public void method11() {
		
		/*
		 * 로또 번호 자동 생성 프로그램을 만드세요
		 * 
		 * 힌트
		 * 1 ~ 45 까지 임의의 수를 중복 없이 6개 발생시키
		 */
		
		int[] result = new int[6];
		
		for (int i = 0; i<result.length; i++)  {
			result[i] = (int)(Math.random() * 45) + 1;
			
			for (int j=0; j<i; j++) {
				if (result[i] == result[j]) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(result));
		
	}
	
	
	
	
}
