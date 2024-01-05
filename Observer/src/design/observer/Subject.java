package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private int state;

	private List<Observer> observers = new ArrayList<Observer>();
	
	
	public int getState() {
		return state;
	}

	public void attach(Observer register) {
		
		observers.add(register);
	}
	
	public void setState(int state) {
		this.state = state;
	
		notifyAllObservers();
		
	}

	private void notifyAllObservers() {
		
		for(Observer obs:observers) {
			obs.update();
		}
		
	}
	
	


}
