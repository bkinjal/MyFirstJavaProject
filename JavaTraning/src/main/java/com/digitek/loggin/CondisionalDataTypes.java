package com.digitek.loggin;

import org.apache.log4j.Logger;

public class CondisionalDataTypes {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);
	 

	public static void main(String[] args) {
		ifElseExample();
		

	}
	
	public static void ifElseExample(){
		int no1 = 33;
		int no2 = 11;
		
		int sum = no1+no2;
		
		if (sum<33){
			log.trace("trace message!"+ "sum is less then 33");
			log.error("error message!"+ "sum is less then 33");
			log.debug("debug message!"+ "sum is less then 33");
			log.info("info message!"+ "sum is less then 33");
			log.warn("warn message!"+ "sum is less then 33");
			
			
		}else if (sum>55){
			log.trace("trace message!"+ "sum is less then 55");
			log.error("error message!"+ "sum is less then 55");
			log.debug("debug message!"+ "sum is less then 55");
			log.info("info message!"+ "sum is less then 55");
			log.warn("warn message!"+ "sum is less then 55");
			
		}else if (sum==44){
			log.trace("trace message!"+ "sum is equal to 44");
			log.error("error message!"+ "sum is equal to 44");
			log.debug("debug message!"+ "sum is equal to 44");
			log.info("info message!"+ "sum is equal to 44");
			log.warn("warn message!"+ "sum is equal to 44");
			
		}else {
			log.trace("trace message!"+ "nothing of the above");
			log.error("error message!"+ "nothing of the above");
			log.debug("debug message!"+ "nothing of the above");
			log.info("info message!"+ "nothing of the above");
			log.warn("warn message!"+ "nothing of the above");
	}
	}

}
