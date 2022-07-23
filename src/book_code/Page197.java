package book_code;

public class Page197 {
	public static void main(String[] args) {
		// 길이가 10인 배열 생성
		int[] score = new int[10];
		
		// 1부터 100 사이의 난수로 배열 채우기
		for (int i=0; i < score.length; i++) {
			int j = (int)(Math.random()*100)+1;
			score[i] = j;
			
			// 배열 출력
			System.out.print(score[i] + ",");
		}
		
		System.out.println();
		
		// 변수에 배열의 첫번째 요소 저장
		int max = score[0];
		int min = score[0];
		
		// 배열 중 가장 큰 수와 작은 수로 변경
		for (int i = 1; i < score.length; i++) {
			if (score[i] > max)
				max = score[i];
			else if (score[i] < min)
				min = score[i];
		}
		
		System.out.println("배열요소 중 가장 큰 값은 "+max);
		System.out.println("배열요소 중 가장 작은 값은 "+ min);

	}
}
