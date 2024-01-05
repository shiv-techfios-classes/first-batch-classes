package design.template;

public abstract class Game {

	protected abstract void loadconfigurations();
	
	protected abstract void startplay();
	
	protected abstract void finishplay();
	
    final public void playVideoGame() {
    
		
		//initialize the game
		loadconfigurations();
 		
		//start the game
		startplay();

		
		//end the game
		finishplay();

	}

}
