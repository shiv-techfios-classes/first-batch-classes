package com.lazy.singleton;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance() {
    	
    	System.out.println(instance);
       
    	if (instance == null) {
        
    		instance = new LazyInitializedSingleton();
        }
        
    	return instance;
    }
	
}


