package com.utils.time;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ChainedLambdas {

	public ChainedLambdas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		lambdaChaining();
		
	}

	public static void lambdaChaining() {
	    System.out.println("\nlambda chaining:");
	    List<String> l = Arrays.asList("1", "22", "333", "4444", "55555", "666666", "7777777", "88888888", "999999999");
	    Function<String, ?> f = s -> s.length();
	    Consumer<String> c = s -> System.out.println(f.apply(s));;
	    l.forEach(c);
	}
}
