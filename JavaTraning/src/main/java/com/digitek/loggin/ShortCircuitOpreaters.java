package com.digitek.loggin;

import org.apache.log4j.Logger;

public class ShortCircuitOpreaters {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		shortCircuit();
		

	}
	
	public static void shortCircuit(){
		int A= 10;
		int B= 15;
		int C= 20;
		
		boolean resultAnd = (A<B)&&(B<C)&&(C<A)&&(A==C)&&(C>A);
		log.trace("trace message!" + resultAnd);
		log.debug("debug message!" + resultAnd);
		log.info("info message!" + resultAnd);
		log.warn("warn message!" + resultAnd);
		log.error("error message!" + resultAnd);
		
		boolean resultOr = (A<B)||(B<C)||(C<A)||(A==C)||(C>A);
		log.trace("trace message!" + resultOr);
		log.debug("debug message!" + resultOr);
		log.info("info message!" + resultOr);
		log.warn("warn message!" + resultOr);
		log.error("error message!" + resultOr);
	}
	

}
