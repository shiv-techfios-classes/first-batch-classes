package com.patterns.creational;

import java.io.IOException;

interface CommandExecutor {
	
	public void runCommand(String cmd) throws Exception;

}


class CommandExecutorImpl implements CommandExecutor {

	@Override
	public void runCommand(String cmd) throws IOException{
		
		
		System.out.println(Runtime.getRuntime().exec(cmd));
		
		System.out.print(cmd+" executed accordingly.");
		
	}
	
}

class CommandExectorProxyImpl implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;
	
		
	public CommandExectorProxyImpl(String user, String pswd) {
		
		if(user.equals("pankaj") && pswd.equals("1234"));
		{
			executor= new CommandExecutorImpl();
		}
	}
	
	
  @Override
	public void runCommand(String cmd) throws Exception {
		// 
	  isAdmin = true;
	  
	  if(isAdmin) {
		  
		  executor.runCommand(cmd);
	  } else {
		  
		  System.out.print("Only admins allowed to execute commands.");
	  }
		
	}
	
	
}








