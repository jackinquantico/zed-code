package inheritance;

public class BuyerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
//		System.out.println("남은 돈 : " + b.money);
		b.summary();
	}

}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3];
	int i = 0;
	
	public void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 "+p+"을/를 살 수 없습니다.");
			return;
		}
		
		this.money -= p.price;
		add(p);
	}
	
	public void add(Product p) {
		if (i >= cart.length) {
			Product[] newCart = new Product[cart.length*2];
			System.arraycopy(cart, 0, newCart, 0, cart.length);
			cart = newCart;
		}
		
		cart[i++] = p;
	}
	
	public void summary() {
		String list = "";
		int sum = 0;

		for (int i=0; i < cart.length; i++) {
			if(cart[i] == null)
				break;
			list += cart[i]+", ";
			sum += cart[i].price;
		}
		
		System.out.println("구입한 물건 : " + list);
		System.out.println("사용한 금액 : "+sum);
		System.out.println("남은 금액 : " +money);
		
	}
}

class Product {
	int price;
	int remain;
	
	public Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	@Override
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}