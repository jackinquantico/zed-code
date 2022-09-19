package studyreview.week2.day2;

import java.util.Scanner;

public class A_For {

	public void method11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		sc.nextLine();
		
		System.out.print("공차 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<10; i++) {
			System.out.print(start + " ");
			
			start += num;
		}
		
	}
	
	
}
