package strategy;

public class AddStrategy implements Strategy {

	@Override
	public int performTask(int a, int b) {
		
		return a+b;
	}

}
