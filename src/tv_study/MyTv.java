package tv_study;

public class MyTv {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Tvtest t = new Tvtest();
			
			t.setC(10);
			t.setV(20);
			
			System.out.println("CH = " + t.getC());
			System.out.println("VOL = " + t.getV());
			
			t.setC(60);
			t.setV(10);
			
			System.out.println("CH = " + t.getC());
			System.out.println("VOL = " + t.getV());
			
			t.gotoprevC();
			t.gotoprevV();
			
			System.out.println("CH = " + t.getC());
			System.out.println("VOL = " + t.getV());
		}

	}

	class Tvtest {
		private int channel;
		private int volume;
//		private boolean powerOn;
		private int prevChannel;
		private int prevVolume;

		final int MAX_C = 100;
		final int MIN_C = 1;
		
		final int MAX_V = 100;
		final int MIN_V = 0;
		
		public int getC() {
			return channel;
		}
		
		public void setC(int num) {
			if (num < MIN_C|| num > MAX_C)
				return;
			
			prevChannel = this.channel;
			this.channel = num;
		}
		
		public int getV() {
			return volume;
		}
		
		public void setV(int num) {
			if (num < MIN_V || num > MAX_V)
				return;
			
			prevVolume = this.volume;
			this.volume = num;
		}
		
		public void gotoprevC() {
			setC(prevChannel);
		}
		
		public void gotoprevV() {
			setV(prevVolume);
		}
	}