package com.zenith;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
		//print string 'log' surrounded by ***
		System.out.println("***" + log + "***");
		
		
	}


	@Override
	public void error(String error) {
		// print string 'error' in a box of '*'
		// determine how many '*' to put top and bottom
		StringBuilder box = new StringBuilder();
		int asterisk = error.length() + 13;
		
		for (int i = asterisk; i > 0; i--) {
			
			box.append('*');
			
		}
		
		System.out.println(box.toString());
		System.out.println("***Error: " + error + "***");
		System.out.println(box.toString());
		
	}

}
