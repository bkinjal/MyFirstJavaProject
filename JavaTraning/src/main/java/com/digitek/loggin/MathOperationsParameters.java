package com.digitek.loggin;

import org.apache.log4j.Logger;

public class MathOperationsParameters {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		multiplicationWithParameters(20,2);
		multiplicationWithParameters(50,2);
		multiplicationWithParameters(70,2);
		

	}
	
	public static int multiplicationWithParameters(int no1, int no2){
		int result = no1*no2;
		
		log.trace("trace message!" + result);
		log.debug("debug message!" + result);
		log.info("info message!" + result);
		log.warn("warn message!" + result);
		log.error("error message!" + result);
		
		return result;
	}

}
