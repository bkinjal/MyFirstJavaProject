package com.digitek.loggin;

import org.apache.log4j.Logger;

public class MathOperationWithReturnTypes {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		int result1= addisionWithReturnTypes();
		int result2= result1+ 10;
		log.trace("trace message!" + result2);
		log.debug("debug message!" + result2);
		log.info("info message!" + result2);
		log.warn("warn message!" + result2);
		log.error("error message!" + result2);
		int result3= result1*1;
		log.trace("trace message!" + result3);
		log.debug("debug message!" + result3);
		log.info("info message!" + result3);
		log.warn("warn message!" + result3);
		log.error("error message!" + result3);
		

	}
	
	public static int addisionWithReturnTypes(){
		int no1 = 6;
		int no2 = 25;
		
		int sumResult = no1+ no2;
		
		log.trace("trace message!" + sumResult);
		log.debug("debug message!" + sumResult);
		log.info("info message!" + sumResult);
		log.warn("warn message!" + sumResult);
		log.error("error message!" + sumResult);
		
		return sumResult;
		
	}

}
