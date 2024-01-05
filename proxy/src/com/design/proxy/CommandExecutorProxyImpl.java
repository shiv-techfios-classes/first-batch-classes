package com.design.proxy;

import com.design.proxy.CommandExecutor;
import  com.design.proxy.CommandExecutorImpl;

public class CommandExecutorProxyImpl implements CommandExecutor{
	
	private boolean isAdmin;

	
	private CommandExecutor executor;
	
		
	public CommandExecutorProxyImpl() {
		
		executor = new CommandExecutorImpl();
	
	}
	
	
  @Override
	public void runCommand(String cmd) throws Exception {
	  
	  if(cmd.equalsIgnoreCase("delete") || cmd.equalsIgnoreCase("format")) {
			
			throw new RuntimeException("delete/format commands are not allowed.");
		}
		 
	  
	  boolean isAdmin = true;
	  
	  String user = "s3cret";
	  
	  String token = "123";
	  
	  boolean isValid = user.equals("s3cret") && token.equals("123") && isAdmin;
	  
	  if(isValid) {
		  
		  executor.runCommand(cmd);
	  } else {
		  
		  System.out.print("Only admins allowed to execute commands.");
	  }
		
	}
	

}
