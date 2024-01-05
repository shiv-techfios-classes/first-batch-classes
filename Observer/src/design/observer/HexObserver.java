package design.observer;

public class HexObserver extends Observer {
	
	public HexObserver(Subject sub) {
		
		this.subject=sub;
		this.subject.attach(this);
	}
	

	@Override
	public void update() {
		
		System.out.println("Hex value of state:" + Integer.toHexString(subject.getState()));
		
		

	}

}
