package com.digitek.loggin;

import org.apache.log4j.Logger;

public class PrimitiveDataType {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		substraction();
		

	}
	
	public static void substraction(){
		double no1 = 33.00;
		double no2 = 13.00;
		
		double sum = no1 - no2;
		
		log.trace("trace message!" + sum);
		log.debug("debug message!" + sum);
		log.info("info message!" + sum);
		log.warn("warn message!" + sum);
		log.error("error message!" + sum);
				
	}

}
