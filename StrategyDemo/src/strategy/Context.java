package strategy;

public class Context {
	
	Strategy strategy;
	
	
    public Context(Strategy strg) {
    	
    	this.strategy = strg;
    }
    
    public int execute(int x, int y) {
    	
    	int result = strategy.performTask(x, y);
    	
    	return result;
    }
    
    
}
