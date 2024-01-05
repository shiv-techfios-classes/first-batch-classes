package game.guess;

import java.io.Serializable;
import java.util.Random;

public class NumberGuessBean implements Serializable {
	  
	   private int answer;       // the random number to be guessed
	   private boolean success;  // got the answer?
	   private String hint;      // hinting messages, e.g., "higher", "lower"
	   private int numGuesses;   // number of guesses made so far, init to 0
	   private Random random;    // random number generator
	  
	   // Constructor
	   public NumberGuessBean() {
	      random = new Random(); // Init the random number generator
	      reset();
	   }
	  
	   // Reset the game
	   public void reset() {
	      // Generate a random int between 1 to 100, uniformly distributed.
	      answer = random.nextInt(100) + 1;
	      success = false;
	      numGuesses = 0;
	   }
	  
	   // <jsp:setProperty name="numguess" property="*"/> bounds to this method
	   //   because setGuess() matches request parameter "guess".
	   // Always set the values of numGuesses and hint.
	   // Set success if user got the answer right.
	   public void setGuess(String strIn) {
	      ++numGuesses;  // one more guess step
	  
	      int numIn;
	      // Convert the input String to an int.
	      // Catch if the input string does not contain a valid int.
	      try {
	         numIn = Integer.parseInt(strIn);
	      } catch (NumberFormatException e) {
	         hint = "a number next time";
	         return;
	      }
	  
	      if (numIn == answer) {
	         success = true;
	      } else if (numIn < answer) {
	         hint = "higher";
	      } else if (numIn > answer) {
	         hint = "lower";
	      }
	   }
	  
	   // Public getters for private variables success, hint and numGuesses.
	   // No public setters. Values are set in the setGuess() method.
	   public boolean isSuccess() { return success; }
	   public String getHint() { return hint; }
	   public int getNumGuesses() { return numGuesses; }
	}