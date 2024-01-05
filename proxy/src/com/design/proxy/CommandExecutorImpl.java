package com.design.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandExecutorImpl implements CommandExecutor {
	
	@Override
	public void runCommand(String cmd) throws IOException{

		Runtime rt = Runtime.getRuntime();
	//	String[] commands = {"system.exe", "-get t"};
		Process proc = rt.exec(cmd);

		BufferedReader stdInput = new BufferedReader(new 
		     InputStreamReader(proc.getInputStream()));

		BufferedReader stdError = new BufferedReader(new 
		     InputStreamReader(proc.getErrorStream()));

		// Read the output from the command
		System.out.println("Here is the standard output of the command:\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		}

		// Read any errors from the attempted command
		System.out.println("Here is the standard error of the command (if any):\n");
		while ((s = stdError.readLine()) != null) {
		    System.out.println(s);
		}

//		
//		Process ps = Runtime.getRuntime().exec(cmd);		
//		
//		System.out.println(ps.getOutputStream());
//		
//		System.out.print(cmd+" executed accordingly.");
//		
	}

}
