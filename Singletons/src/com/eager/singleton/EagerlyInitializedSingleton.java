package com.eager.singleton;

import java.util.function.Consumer;

public class EagerlyInitializedSingleton {
	
	
	private  EagerlyInitializedSingleton() {
		
		
	};
	
	//example use of consumer to print message on console

    static Consumer<String> logger = (msg) -> System.out.println(msg);
	

	private static final EagerlyInitializedSingleton _eagerInstance = new EagerlyInitializedSingleton();
	

	public static EagerlyInitializedSingleton getInstance() {
		
		logger.accept("returning eagerly initialized instance");
		
		return _eagerInstance;
	}

	public static void main(String[] args) {
		
		getInstance();

	}

}
