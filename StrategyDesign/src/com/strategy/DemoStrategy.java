package com.strategy;

public class DemoStrategy {

	public DemoStrategy() {
	
	}

	public static void main(String[] args) {
		
		Context ctx = new Context(new AddStrategy());
		
		System.out.println("1+2=" + ctx.execute(1, 2));


	}

}
