package com.digitek.repetaedData;

import org.apache.log4j.Logger;

public class WhileLoopData {
	
	final static Logger log=Logger.getLogger(Logger.class);
	
	public static void main(String[] args){
		printNameUsingWhile();
		
	}
	
	public static void printNameUsingWhile(){
		int counter=0;
		
		while (counter<14){
		
			log.trace("trace message!"+ counter);
			log.debug("debug message!"+ counter);
			log.info("info message!"+ counter);
			log.warn("warn message!"+ counter);
			log.error("error message!"+ counter);
			
		counter=counter+2;
	}
	}

}
