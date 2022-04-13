package com.qa.test;

import org.testng.annotations.Test;

public class StringReverse {
	
	
	@Test()
	
	public void stringReverseTest() {
		
		String name="Ujjwla";
		
		char ch;
		String name2="";
		
		for(int i=(name.length()-1); i>=0;i--) {
			
			//System.out.println(name.charAt(i));
			
			ch=name.charAt(i);
			
			name2= name2+ch;
			
			
		}
		
		System.out.println(name2);

		
		
}

	
}
