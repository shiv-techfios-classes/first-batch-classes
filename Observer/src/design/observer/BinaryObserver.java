package design.observer;

public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject sub) {
		
		this.subject = sub;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));

	}

}
