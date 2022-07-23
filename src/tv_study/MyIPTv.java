package tv_study;

public class MyIPTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tvtest tv = new Tvtest();
		IpTv ipTv = new IpTv();
		
		tv.setC(25);
		ipTv.setC(45);
		
		System.out.println("TV CH : "+tv.getC());
		System.out.println("IPTV CH : "+ipTv.getC());
		
		ipTv.setInternet();
		System.out.println("IPTV is " + ipTv.getInternet());
		
		ipTv.plusC(5);
		System.out.println("IPTV CH : "+ipTv.getC());
	}

}

class IpTv extends Tvtest{
//	private int channel;
//	private int prevChannel;
	private boolean internetOn;
	
	public String getInternet(){
		if (internetOn == true)
			return "On";
		return "Off";
	}
	
	public void setInternet(){
		this.internetOn = !internetOn;
	}
	
	@Override
	public void setC(int num) {
		if (num < MIN_C || num > MAX_C)
			return;
		
//		prevChannel = this.channel;
		super.setC(num);
	}
	
	public void plusC(int num) {
		if (super.getC() + num * 10 > MAX_C || super.getC() + num * 10 < MIN_C)
			return;
		
		setC(super.getC()+num*10);
	}
}