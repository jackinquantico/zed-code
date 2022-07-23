package tv_study;

public class TotalTvTest {
	public static void main(String args[]) {
		// Tv, Radio, IPTv 모두 사용하기
		Tvtest tv = new Tvtest();
		Radio radio = new Radio();
		IpTv ipTv = new IpTv();
		
		tv.setC(10);
		tv.setV(10);
		System.out.println("TV CH : "+tv.getC());
		System.out.println("TV VOL : "+tv.getV());

		radio.setC(20);
		radio.setV(20);
		System.out.println("Radio CH : "+radio.getC());
		System.out.println("Radio VOL : "+radio.getV());
		
		ipTv.setC(30);
		ipTv.setV(30);
		System.out.println("IPTV CH : "+ipTv.getC());
		System.out.println("IPTV VOL : "+ipTv.getV());

		radio.setC(40);
		System.out.println("Radio CH : "+radio.getC());
		radio.gotoprevC();
		System.out.println("Radio CH : "+radio.getC());
		
		radio.setMode();
		System.out.println("Radio is now in " + radio.getmode() +" mode");
		
		ipTv.setInternet();
		System.out.println("IPTV is now " + ipTv.getInternet());
		
		// 다형성 연습 : 조상의 리모컨으로 자손 멤버 사용하기
		
		Tvtest t1 = new IpTv();
		t1.setC(10);
		System.out.println("T1 CH : "+t1.getC());
		
		Tvtest t2 = new Radio();
		t2.setV(10);
		System.out.println("T2 VOL : " + t2.getV());
//		t2.getmode(); 			// getmode()메소드 버튼은 티비 리모컨에 없음
		
//		ipTv t3 = new Tvtest(); // 자손 타입 클래스로 조상객체 조절 불
		
	}
}
