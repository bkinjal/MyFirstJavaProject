package com.digitek.repetaedData;

import org.apache.log4j.Logger;

public class ForLoopData {
	final static Logger log=Logger.getLogger(Logger.class);
	
	public static void main(String[] args){
		printNameRepetaedly5Times();
		
	}
	
	public static void printNameRepetaedly5Times(){
		for(int counter=0; counter<=12; counter= counter+3){
			
			log.trace("trace message!"+ counter);
			log.debug("debug message!"+ counter);
			log.info("info message!"+ counter);
			log.warn("warn message!"+ counter);
			log.error("error message!"+ counter);
		}
	}
		
	
		
	}


