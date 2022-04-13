package com.qa.test;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class StringDublicateTest {
	
	
	
	
	@Test()
	
	public void stringOpeartion() {
		
		
		String str="JalaTechnology";
		
		
		char c []= str.toCharArray();
		
		
		HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
		
		 for(char ch:c) {
			 
			 if(hm.containsKey(ch)) {
				 
				 hm.put(ch, hm.get(ch)+1);
			 } 
				 else {
					 
					 hm.put(ch, 1);
				 }
			 
		 }
	
		Set<Map.Entry<Character,Integer>> set=hm.entrySet();
	
	  for(Map.Entry<Character,Integer> e: set) {
		
		if(e.getValue()>1) {
		
		
	      System.out.println(e.getKey() + ": "+ e.getValue());
	
		
		}
	
		
	  //System.out.println(e.getKey() + ": "+ e.getValue());
	  }
		
	
		
	}	
		
	
	

}
