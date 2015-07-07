package com.digitek.business;

import org.apache.log4j.Logger;

import com.digitek.loggin.LoggerExample;

public class ShortCircuitOpreaters {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		shortCircuit();
		

	}
	
	public static void shortCircuit(){
		int a = 10;
		int b = 15;
		int c = 20;
		
		boolean resultAnd = (a>b)&&(b<c)&&(c>b)&&(c>a);
		System.out.println("resultAnd "+ resultAnd);
		log.trace("trace message!"+ resultAnd);
		log.debug("debug message!"+ resultAnd);
		log.info("info message!"+ resultAnd);
		log.warn("warn message!"+ resultAnd);
		log.error("error message!"+ resultAnd);
		
		boolean resultOr = (a>b)||(b>c)||(c>b)||(c<a);
		System.out.println("resultOr "+ resultOr);
		log.trace("trace message!"+ resultOr);
		log.debug("debug message!"+ resultOr);
		log.info("info message!"+ resultOr);
		log.warn("warn message!"+ resultOr);
		log.error("error message!"+ resultOr);
	}

}
