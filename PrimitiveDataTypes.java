package com.digitek.business;

import org.apache.log4j.Logger;

import com.digitek.loggin.LoggerExample;

public class PrimitiveDataTypes {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);
	
	public static void main(String[] args){
		addision();
		
	}
	
	public static void addision(){
		double no1 = 11.14;
		double no2 = 6.25;
		
		double sum = no1 + no2;
		System.out.println("sum "+ sum);
		log.trace("trace message!"+ "sum "+ sum);
		log.error("error message!"+ "sum "+ sum);
		log.debug("debug message!"+ "sum "+ sum);
		log.info("info message!"+ "sum "+ sum);
		log.warn("warn message!"+ "sum "+ sum);
	}
		
	}

	


