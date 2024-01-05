package strategy;

public class LaunchStrategy {

	public static void main(String[] args) {
		
		Strategy multiply =  new MultiplicationStrategy();
		
		Strategy addition =  new AddStrategy();
		
		Context context = new Context(multiply);
		
		context = new Context(addition);
		
		System.out.println(context.execute(2, 3));
		
		System.out.println(context.execute(45,5));

	}

}
