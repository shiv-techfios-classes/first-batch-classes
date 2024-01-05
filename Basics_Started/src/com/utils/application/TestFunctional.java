package com.utils.application;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


@FunctionalInterface
interface Square {
	
    int calculate(int x, int y);
    
 //   void getSquare();
    
    default void printSquare() {
    	
      System.out.println("Square printed");
    }
    
    default void printOther() {
    	
        System.out.println("printed Other.");
      }
    
    
    
}

class SquareImpl implements Square {

	@Override
	public int calculate(int x, int y) {
		
		return x*y;
	}	
	
}


interface Cube{
	
	int cube(int y);
}

class CubeImpl implements Cube {

	@Override
	public int cube(int y) {
		
		return y^3;
	}
	
	
}

class DoubleConsumer<Double> implements Consumer {


	@Override
	public void accept(Object t) {
		
		
	  System.out.println("Hello from double consume");
		
	}

}


/**
 * 
 *Functional interfaces have only one abstract method and as many non-abstract default methods.

  For example, Consumer and Predicate are functional interfaces since v1.8.

  @Consumer, it has void accept(T t) as its abstract method.

  @Predicate, it has boolean test(T t) as its abstract method.
 * 
 * 
 * 
 * 
 * @author shivj
 *
 */



public class TestFunctional {

	
	public static void main(String[] args) {
		
		
		
		    Square s= (x, y) -> x*y;
		    
		    Cube cu = (x) -> x^3;
		    
		    System.out.println("Cube:" + cu);
		
		    s.printSquare();
		    s.printOther();
		    
		    System.out.println(s.calculate(6, 2));
		    
		    
	    System.out.println("#########################################################################");	    
		    
		
		    int a = 5;
		  
	        // lambda expression to define the calculate method
		    
		    Consumer<Integer> consumer = (Integer value) ->  {
		    	
		    	System.out.println(value);
		    	
		    	long inValue = value.intValue();
		    	
		    	System.out.println("Double:" + inValue*2);
		    	
		    	System.out.println("Cube:" + inValue*inValue*inValue);
		    	
		    	System.out.println("Cube root:" + Math.cbrt(inValue));
	    	
		    	
		    };
		    
		    
		    Predicate<Integer> testNonZero = (x) -> x!=0;
		    
		    Predicate<Employee> nonNull = (emp) -> emp!=null;
		    
		    
		    int val = 1;
		    
		    Consumer<Integer> consum = (Integer value) -> {
		    	
		    	int x = Integer.valueOf(value);
		    	
		    	if(testNonZero.test(value))
		    		System.out.println();
		    };

	
		    
            consumer.accept(Integer.valueOf(3));
		    
		    consumer.accept(Integer.valueOf(4));
		    
		    
           System.out.println("#########################################################################");	    
		    		    
		    
		    
		    Function<Double, Double> sqr = (x) -> x*x;
		    
		    Function<Double, Double> squareAndThreeFourth = sqr.andThen(y->y*1/2);
		    
		    Function<Double, Double>  addOne = squareAndThreeFourth.andThen(z->z+1);
		    
		    double res =addOne.apply(6.0);
		    
		    System.out.println("andThen is:" + res );
		    
		    
		    
		    Employee e1 = new Employee(11, "Mike", "DEO");
		    
		    Predicate<Employee> t1 = (x) -> x !=null;
		    
		    BiPredicate<Integer, String> t2 = (x, y) -> x.intValue()>0 && y.length()<10;
		    
		    System.out.println(t1.test(e1));
		    
		    System.out.println(t2.test(Integer.valueOf(1), "Tim"));
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
 		    
		    
		  
		    
	    
	    

	}
	
	

}


