package design.template;

import java.util.function.Consumer;

public class SoccerWorldCup extends Game {

	static Consumer<String> soccerLogger = Logger.getLogger();
	
	@Override
	public void finishplay() {
		
		soccerLogger.accept("Finished playing soccer world cup.");
		
	}

	

	@Override
	public void startplay() {
		
		soccerLogger.accept("Starting playing soccer world cup.");
	}
	
	@Override
	public void loadconfigurations() {
		
		soccerLogger.accept("Initializing soccer world cup.................");
		
		
	}



}
