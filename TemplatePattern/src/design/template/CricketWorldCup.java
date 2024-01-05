package design.template;

import java.util.function.Consumer;

public class CricketWorldCup extends Game {
	
	static Consumer<String> cricketlogger = Logger.getLogger();

	
	@Override
	protected void loadconfigurations() {
		
		cricketlogger.accept("loading configurations..........................");
		
	}

	@Override
	protected void startplay() {
	
		cricketlogger.accept("Started playing games.....");
	}

	@Override
	protected void finishplay() {
		
		cricketlogger.accept("Finished playing cricket world cup.");
	}
	
	

}
