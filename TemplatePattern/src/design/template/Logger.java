package design.template;

import java.util.function.Consumer;

public class Logger {

	public static Consumer<String> getLogger() {
		
		Consumer<String> log = (x) -> System.out.println(x);
		
		return log;
	}

}
