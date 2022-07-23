package book_code;

// 스캐너 임포
import java.util.Scanner;

public class Page41 {

	public static void main(String[] args) {
		// 스캐너 사용하는 방법
		System.out.println("숫자를 입력해주세요 >>");
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력 받기는 nextLine()메소드 사용
		String strInput = sc.nextLine();
		
		// 입력받은 문자열을 숫자로 변환해야 하면 Integer 클래스의 parseInt() 사용하면 되지만
		int strToNum = Integer.parseInt(strInput);
		
		// 아예 처음부터 nextInt() 메소드 사용하면 숫자만 받을 수 있다
		int numInput = sc.nextInt();
		
		System.out.println("문자열 -> 숫자 : "+strToNum);
		System.out.println("숫자로 입력받기 : "+numInput);
	}
}
