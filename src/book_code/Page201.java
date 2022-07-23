package book_code;

public class Page201 {

	public static void main(String[] args) {
		int[] number = new int[10];
		
		System.out.print("원래 숫자 : ");
		for (int i=0; i < number.length; i++) {
			System.out.print(number[i]= (int)(Math.random()*number.length));
		}
		System.out.println();
		
		for (int i=0; i < number.length-1; i++) {
			boolean changed = false;
			
			for (int j=0; j < number.length-1-i; j++) {
				if(number[j] > number[j+1]) {
					int tmp = number[j];
					number[j] = number[j+1];
					number[j+1] = tmp;
					
					changed = true;
				}
			}
			
			if (!changed)
				break;
			
			System.out.print("바뀐 숫자 : ");
			for (int k=0; k < number.length; k++) {
				System.out.print(number[k]);
			}
			System.out.println();
		}	
	}
}
