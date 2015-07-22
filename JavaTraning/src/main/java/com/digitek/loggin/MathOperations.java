package com.digitek.loggin;

import org.apache.log4j.Logger;

public class MathOperations {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		addision();
		
		

	}
	
	public static void addision(){
		int number1 = 14;
		int number2 = 11;
	
		
		int sum = number1+number2;
		
	
		log.trace("Trace message!" + sum);
		log.debug("Debug message!" + sum);
 		log.info("Info message!" + sum);
 		log.warn("warn message!" + sum);
 		log.error("Error message!" + sum);
		
	}

}
