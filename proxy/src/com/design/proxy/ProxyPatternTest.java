package com.design.proxy;

	
public class ProxyPatternTest {
		
		
		public static void main(String... args) {
			
			//boolean isAdmin =true;
			
			CommandExecutor service = new CommandExecutorProxyImpl();
			
			try {
				 service.runCommand("java -version");
				
			//	service.runCommand("systeminfo");
			} catch (Exception e) {
			
				e.printStackTrace();
			}
			
		}
		
		
	}

