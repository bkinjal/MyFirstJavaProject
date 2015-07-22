package com.digitek.loggin;

import org.apache.log4j.Logger;

public class LoggerExample {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		logLevelDemo();
		
	}
	
	public static void logLevelDemo(){
		
		String methodName="logLevelDemo";
		
		log.trace("trace message!"+ methodName);
		log.debug("debug message!"+ methodName);
		log.info("info message!"+ methodName);
		log.warn("warn message!"+ methodName);
		log.error("error message!"+ methodName);
	}

}
