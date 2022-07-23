package exception_study;

public class TwoTryCatch {
	public static void main(String[] args) {
		try {
			// main 메소드 실행시 method1이 호출됨.
			method1(); // null 예외를 처리하지 못함, 3을 출력한 뒤 돌아옴
		} catch (Exception e) { // 예외의 최고 조상이 null 예외를 catch
			System.out.println(5); // 5가 출력되고 main 메소드 종료
		}
	} //main
	
	static void method1() {
		try {
			// method1은 method2를 호출
			method2(); // null 예외 발생
			System.out.println(1); // 예외 발생으로 출력되지 않음 
		} catch (ArithmeticException e) { //ArithmeticException는 null 예외 처리할 수 없으므로
			System.out.println(2); // 출력되지 않음
		} finally { // finally 블록은 모든 상황에서도 출력되므로
			System.out.println(3); // 3이 가장 먼저 출력되고 method1이 호출되었던 위치로 돌아감
		}
		
		System.out.println(4); // 메소드의 비정상 종료로 출력되지 않음
	} //method1
	
	static void method2() {
		// method2는 null 예외를 발생시킴
		throw new NullPointerException();
	} //method2
}
