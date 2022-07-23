package inheritance;

public class UnitTest {
	public static void main(String args[]) {
		Marine m = new Marine();
		
		m.move(3, 5);
		m.stimPack();
		
		Dropship d = new Dropship();
		
		d.stop();
		d.load();
		d.unload();
		
	}
}

class Unit {
	int x, y;
	void move(int x, int y) {
		System.out.println("X축으로 "+x+", Y축으로 "+y+" 이동했습니다.");
	}
	void stop() {
		System.out.println("자리에 멈췄습니다.");
	}
}


class Marine extends Unit{
	void stimPack() {
		System.out.println("스팀팩을 사용합니다.");
	}
}

class Tank extends Unit{
	void changeMode() {
		System.out.println("공격 모드를 변환합니다.");
	}
}

class Dropship extends Unit{
	void load() {
		System.out.println("대상을 태웁니다.");
	}
	void unload() {
		System.out.println("대상을 내립니다.");
	}
}