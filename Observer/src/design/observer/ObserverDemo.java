package design.observer;


public class ObserverDemo {
	

	public static void main(String[] args) {

		Subject sub  = new Subject();
		
		new HexObserver(sub);
		
		new BinaryObserver(sub);
		
		sub.setState(5);
		
		sub.setState(4);
		
		sub.setState(11);
		
	}

}
