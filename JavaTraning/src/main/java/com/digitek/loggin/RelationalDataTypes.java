package com.digitek.loggin;

import org.apache.log4j.Logger;

public class RelationalDataTypes {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		relational();
		

	}
	
	public static void relational(){
		int value1 = 14;
		int value2 = 11;
		
		if(value1<value2){
			log.trace("trace message!" + "111 value1<value2");
			log.debug("debug message!" + "111 value1<value2");
			log.info("info message" + "111 value1<value2");
			log.warn("warn message!" + "111 value1<value2");
			log.error("error message!" + "111 value1<value2");
		}
		
		if(value1>value2){
			log.trace("trace message!" + "222 value1>value2");
			log.debug("debug message!" + "222 value1>value2");
			log.info("info message" + "222 value1>value2");
			log.warn("warn message!" + "222 value1>value2");
			log.error("error message!" + "222 value1>value2");
		}
		
		if(value1<=value2){
			log.trace("trace message!" + "333 value1<=value2");
			log.debug("debug message!" + "333 value1<=value2");
			log.info("info message" + "333 value1<=value2");
			log.warn("warn message!" + "333 value1<=value2");
			log.error("error message!" + "333 value1<=value2");
		}
		
		if(value1>=value2){
			log.trace("trace message!" + "444 value1>=value2");
			log.debug("debug message!" + "444 value1>=value2");
			log.info("info message" + "444 value1>=value2");
			log.warn("warn message!" + "444 value1>=value2");
			log.error("error message!" + "444 value1>=value2");
		}
		
		if(value1==value2){
			log.trace("trace message!" + "555 value1==value2");
			log.debug("debug message!" + "555 value1==value2");
			log.info("info message" + "555 value1==value2");
			log.warn("warn message!" + "555 value1==value2");
			log.error("error message!" + "555 value1==value2");
		}
		
		if(value1!=value2){
			log.trace("trace message!" + "666 value1!=value2");
			log.debug("debug message!" + "666 value1!=value2");
			log.info("info message" + "666 value1!=value2");
			log.warn("warn message!" + "666 value1!=value2");
			log.error("error message!" + "666 value1!=value2");
		}
	}
	

}
