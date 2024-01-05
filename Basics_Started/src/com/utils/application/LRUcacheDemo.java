package com.utils.application;


import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcacheDemo {


	public static void main(String args[]){

		LinkedHashMap<String,String> lhm = new LinkedHashMap<String,String>(4,0.75f,true) {

			@Override
			protected boolean removeEldestEntry(Map.Entry<String,String> eldest) {
				return size() > 3;
			}
		};
		
		lhm.put("1", "t1");
		lhm.put("2", "t2");
		lhm.put("3", "t3");
		lhm.put("4", "t4");
		lhm.put("5", "t5");
		lhm.put("6", "t6");
		lhm.put("7", "t7");
	
		System.out.println(lhm);

	}

}

