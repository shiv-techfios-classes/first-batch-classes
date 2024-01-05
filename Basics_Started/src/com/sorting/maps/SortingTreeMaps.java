package com.sorting.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortingTreeMaps {
	

	 static final Map<String, String> map = 
	            new TreeMap<String, String> (new Comparator<String>() {
	        @Override
	        public int compare(String k1, String k2) {
	        	
               int diff_length = k1.length() - k2.length();
	            if (diff_length != 0) return diff_length;
	            return k2.compareTo(k1);
	        }
	    });


	 static final Map<String, String> map1 = 
	          
			 new TreeMap<String, String> ( (String o1, String o2) -> {
	            	            	
	    	            int diff_length = o1.length() - o2.length();
	    	            if (diff_length != 0) return diff_length;
	    	            return o1.compareTo(o2);
	    	       
	   });
	   
	   
	
	
	
	// static final Map<String, String> map = new TreeMap<String, String>();
	
	
    	
	 
	 public static final void main(String[] args) {
	        map.put("IBARAKI", "MitoCity");
	        map.put("TOCHIGI", "UtunomiyaCity");
	        map.put("GUNMA", "MaehashiCity");
	        map.put("SAITAMA", "SaitamaCity");
	        map.put("CHIBA", "ChibaCity");
	        map.put("TOKYO", "Sinjyuku");
	        map.put("KANAGAWA", "YokohamaCity");

	        
	        
	        System.out.println(map);
	 }

}

