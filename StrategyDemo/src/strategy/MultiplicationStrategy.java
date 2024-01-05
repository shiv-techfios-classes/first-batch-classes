package strategy;

public class MultiplicationStrategy implements Strategy {

	@Override
	public int performTask(int a, int b) {
		
		return a*b;
	}

}
