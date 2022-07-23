package tv_study;

public class MyRadio {

	public static void main(String[] args) {
		Radio r = new Radio();
		
		r.setC(25);
		r.setV(45);
		
		System.out.println("Radio CH : "+r.getC());
		System.out.println("Radio VOl : "+r.getV());

		System.out.println("Radio mode : "+r.getmode());
		r.setMode();
		System.out.println("Radio mode : "+r.getmode());
		
	}

}

class Radio extends Tvtest {
	private boolean FmAm; // AM = true, FM= false
	
	public void setMode() {
		this.FmAm = !FmAm;
	}
	
	public String getmode() {
		if ( FmAm == true)
			return "FM";
		
		return "AM";
	}
}