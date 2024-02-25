package com.zenith;

import java.util.*;

@SuppressWarnings("unused")

public class SpacedLogger implements Logger {
	

	@Override
	public void log(String log) {
		// Prints string log with ' ' space between each char
		
		System.out.println(output(log));
		
	}

	@Override
	public void error(String error) {
		// Prints string error with ' ' space between each char, with "ERROR: " at the start
		
		System.out.println("ERROR: " + output(error));
		
		
	}
	
	// method to return string with space ' ' between chars
	public String output(String input) {
		// Returns string log with ' ' space between each char
		
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			
			output.append(input.charAt(i));
			output.append(' ');
			
		}
		String out = output.toString();
		return out;
		
	}

}
