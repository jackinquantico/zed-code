package sutda_study;

public class SutdaDeckTest {
	public static void main(String args[]) {
		SutdaDeck sDeck = new SutdaDeck();
		
		System.out.print("SutdaDeck의 원래 순서 : ");
		for (int i=0; i <sDeck.CARD_NUM; i++) {
			System.out.print(sDeck.cards[i]+ ",");
		}
		
		System.out.println();
		
		System.out.println("첫번째 랜덤 픽 : " + sDeck.pick());
		System.out.println("첫번째 픽 : " + sDeck.pick(1));
		
		sDeck.shuffle();
		
		System.out.println("두번째 랜덤 픽 : " + sDeck.pick());
		System.out.println("두번째 픽 : " + sDeck.pick(1));
		
		System.out.print("SutdaDeck의 바뀐 순서 : ");
		for (int i=0; i <sDeck.CARD_NUM; i++) {
			System.out.print(sDeck.cards[i]+ ",");
		}
	}
}

class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard [] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for (int i = 0; i < cards.length; i++) {
			int num = i % 10 + 1;
			boolean isKwang = i < 10 && (i == 1 || i == 3 || i == 8);
		
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	public void shuffle() {
		
		
		for (int i = 0; i < cards.length; i++) {
			int j = (int)(Math.random()*cards.length);
			
			SutdaCard tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	public SutdaCard pick(int index) {
		return cards[index];
	}
	
	public SutdaCard pick() {
		int i = (int)(Math.random()*cards.length);
		
		return cards[i];
	}
	
}