package com.digitek.loggin;

import org.apache.log4j.Logger;

public class ArrayDataTypes {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		arrayExample();
	

	}
	
	public static void arrayExample(){

		int[]listOfNumbers={1,2,3,4,5,6,7,8,12,15,17,20,21,23};
		
		for(int counter=0; counter<listOfNumbers.length; counter++){
			
			log.trace("trace message!"+ listOfNumbers[counter]);
			log.error("error message!"+ listOfNumbers[counter]);
			log.debug("debug message!"+ listOfNumbers[counter]);
			log.info("info message!"+ listOfNumbers[counter]);
			log.warn("warn message!"+ listOfNumbers[counter]);
	}
	}

}
