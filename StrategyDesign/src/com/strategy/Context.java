package com.strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		
		this.strategy = strategy;
		
	}
	
	public int execute(int n1, int n2) {
		
		return strategy.doOperation(n1, n2);
	}

}
