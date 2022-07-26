package studyreview.week1.day2;

import studyreview.week1.day2.AboutMainMethod;

public class AboutPrintMethod {
	public static void main(String[] args) {
		
		// println() : 내용물을 출력 후 줄바꿈이 일어남 (개행)
		// System.out.println();
		
		// print() : 내용물을 그냥 출력만 하는 역할
		// System.out.print();
		
		// printf() : 내용물을 지정된 형식에 맞게 출력해주는 역할
		// System.out.printf();
		
		System.out.println("프로그램 실행 시작");
		
		// 같은 클래스 내부에 존재하는 메소드를 호출할 경우 : 메소드명(); 로 호
		printTest_A();
		printTest_B();
		
		// 다른 클래스 내부에 존재하는 메소드를 호출할 경우
		// 내가 호출할 메소드가 존재하는 클래스를 생성 (new)해야 한다.
		AboutMainMethod amm = new AboutMainMethod();
		
		// 해당 클래스가 정확히 어느 패키지에 있는 클래스인지 클래스의 풀네임을 명시하거나
		// 그냥 클래스명을 가지고 생성 구문을 작성하되, 이 클래스가 어느 패키지에 속해있는지 선언문을 추가
		// 대변할이름을 생성 후 해당 클래스에 있는 메소드 호출
		amm.printTest_C();
		
		// 호출한 메소드를 실행한 후에 메소드를 호출했던 위치로 돌아와 다음 코드를 실행함.
		
		System.out.println("프로그램 실행 종료");
		
	}
	
	public static void printTest_A() {
		System.out.println("printTest_A 실행");
	}
	
	public static void printTest_B() {
		System.out.println("printTest_B 실행");
	}
}
