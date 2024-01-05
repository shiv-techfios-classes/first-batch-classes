package com.utils.application;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.Iterator;


public class FindFiles {
	
	
	public static void main(String[] args) {
		
		String direc = "C:\\Users\\shivj\\Downloads";
		
		File dir = new File(direc);
		


		File[] matchPdfs = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				//return name.endsWith("jpg");
				return name.endsWith("pdf");
			}
		});
		
		


		File[] matchJpgs = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return name.endsWith("jpg");
				//return name.endsWith("pdf");
			}
		});
		

		
		System.out.println("--------------------------JPGs------------------------------------");
	
		for(File fi: matchJpgs) 
			System.out.println(fi);
		
		System.out.println("--------------------------PDfs------------------------------------");
		
		for(File fi: matchPdfs)
			System.out.println(fi);
		
		
		
		
	}

}
