package com.eager.singleton;

import com.lazy.singleton.LazyInitializedSingleton;

public class TestEager {

	public static void main(String[] args) {
		
		
	//	EagerlyInitializedSingleton ea = EagerlyInitializedSingleton.getInstance();
		
		System.out.println(LazyInitializedSingleton.getInstance());
		
		System.out.println(LazyInitializedSingleton.getInstance());
		
		LazyInitializedSingleton.getInstance();
		
		LazyInitializedSingleton.getInstance();
		
        System.out.println(LazyInitializedSingleton.getInstance());
		
		System.out.println(LazyInitializedSingleton.getInstance());

	}

}
