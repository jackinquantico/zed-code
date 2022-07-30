package studyreview.week1.day5;

import java.util.Scanner;

public class B_Switch {

	// 과제
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일을 입력하세요(사과, 바나나, 복숭아) : ");
		String fruit =  sc.nextLine();
		
		int price = 0;
		
		switch (fruit) {
		case "사과" : price = 1000;
					 break;
		case "바나나" : price = 2000;
		 			 break;
		case "복숭아" : price = 5000;
		 			 break;
		default : System.out.println("저희 가게에서 판매하는 과일이 아닙니다.");
				  return;
		}
		
		System.out.printf("%s의 가격은 %d원입니다.", fruit, price);
	}
	
}
