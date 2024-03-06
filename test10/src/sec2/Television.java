package sec2;

public class Television implements Screen {
	int lightness;
	int volume;
	int zoom; 
	@Override
	public void turnOff() {
		System.out.println("전원off");
		
	}

	@Override
	public void turnOn() {
		System.out.println("전원on");
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX) {
			this.volume = RemoteControl.MAX;
		}
		else if(volume < MIN) {
			this.volume = RemoteControl.MIN;			
		}
		else {
			this.volume = volume;
			System.out.println("현재볼륨:"+volume);
		}
	}

	@Override
	public int light() {
		System.out.println("밝게");
		if(this.lightness <255 && this.lightness > 0) {
			this.lightness++;
		}
		return this.lightness;
	}

	@Override
	public int dark() {
		System.out.println("어둡게");
		if(this.lightness <255 && this.lightness > 0) {
			this.lightness--;
		}
		return this.lightness;

	}

	@Override
	public int zoomin() {
		if(zoom>=-500 && zoom<=500) {
			zoom+=50;
		}
		return zoom;
	}

	@Override
	public int zoomout() {
		if(zoom>=-500 && zoom<=500) {
			zoom-=50;
		}
		return zoom;
	}

}
