package template.launch;

import design.template.CricketWorldCup;
import design.template.Game;
import design.template.SoccerWorldCup;

public class TemplateDemo {


	public static void main(String[] args) {
		
		Game cricket = new CricketWorldCup();
		
		Game soccer = new SoccerWorldCup();
		
		soccer.playVideoGame();
		
		cricket.playVideoGame();
	}

}
