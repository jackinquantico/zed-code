package book_code;

public class Page165 {

	public static void main(String[] args) {
		for (int i=1; i < 6; i++) {
			for (int j = 1; j <6; j++) {
				//if문 주석처리하면 모든 쌍이 다 나
				if(i == j)
					System.out.print("["+i+","+j+"]");
				else
					System.out.print("\t");
			}
			System.out.println();
		}
	}

}
