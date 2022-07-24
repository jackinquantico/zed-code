package sutda_study;

public class SutdaCardTest {

	public static void main(String[] args) {
		SutdaCard card = new SutdaCard();
		SutdaCard card2 = new SutdaCard(5,false);
		
		System.out.println(card.toString());
		System.out.println(card2.toString());
		
	}

}

class SutdaCard {
	final int NUM;
	final boolean ISKWANG;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) {
		this.NUM = num;
		this.ISKWANG = isKwang;
	}
	
	@Override
	public String toString() {
		return NUM + (ISKWANG ? "K" : "");
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard) {
			SutdaCard s = (SutdaCard)obj;		
			return NUM == s.NUM && ISKWANG == s.ISKWANG;
		}
		return false;
	}
}