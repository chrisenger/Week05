package com.zenith;

public class App {

	public static void main(String[] args) {
		// TODO Implement AsteriskLogger
		// TODO Implement SpacedLogger
		
		// TODO instantiate an instance of each of your logger classes that implement the Logger interface.
		// TODO Test both methods on both instances, passing in Strings of your choice.
		
		Logger asterisk = new AsteriskLogger();
		Logger spaced = new SpacedLogger();
		
		asterisk.log("Hello");
		asterisk.error("Oh god oh no");
		
		spaced.log("Some stuff");
		spaced.error("hello :)");
		
		

	}

}
