package com.patterns.creational;

	
public class ProxyPatternTest {
		
		
		public static void main(String... args) {
			
			//boolean isAdmin =true;
			
			CommandExecutor service = new CommandExectorProxyImpl("Pankaj", "1234");
			
			try {
				service.runCommand("node");
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			
		}
		
		
	}

