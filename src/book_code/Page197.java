package book_code;

public class Page197 {
	public static void main(String[] args) {
		int[] score = {100,79,88,69,97,85,78,99,35};
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
			else if (score[i] < min)
				min = score[i];
		}
		
		System.out.println("배열요소 중 가장 큰 값은 "+max);
		System.out.println("배열요소 중 가장 작은 값은 "+min);

	}
}
