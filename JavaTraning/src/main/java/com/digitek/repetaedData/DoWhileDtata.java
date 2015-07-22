package com.digitek.repetaedData;

import org.apache.log4j.Logger;

public class DoWhileDtata {
	final static Logger log=Logger.getLogger(Logger.class);

	public static void main(String[] args){
		 printNameUsingDoWhile();
		
	}
	public static void printNameUsingDoWhile(){
		int counter=13;
		
		do{
			    log.trace("trace message!"+ counter);
				log.debug("debug message!"+ counter);
				log.info("info message!"+ counter);
				log.warn("warn message!"+ counter);
				log.error("error message!"+ counter);

			counter = counter+3;}
			
		while (counter <= 12);
	}
}
