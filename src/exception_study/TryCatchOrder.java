package exception_study;

public class TryCatchOrder {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b) throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true); 
		/* 1차 : 1 출력, ArithmeticException 발생해서 2는 출력하지 않고 건너뛰어서
		 * ArithmeticException의 조상인 RuntimeException 캐치 블록으로 이동해서 3 출력하고 return
		 * finally 블록은 비정상 종료에도 수행되므로 5 출력하고
		 * main 메소드로 돌아온다 */
		method(false);
		/* 2차 : 1 출력, ArithmeticException 발생하지 않으므로 2를 출력하고
		 * 캐치블록을 모두 건너 뛰어서 finally블록의 5를 출력한 다음
		 * try catch문을 빠져나가서 6을 출력 한 뒤에 메소드 정상 종료 */
	}
}
