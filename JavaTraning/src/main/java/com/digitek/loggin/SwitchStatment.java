package com.digitek.loggin;

import org.apache.log4j.Logger;

public class SwitchStatment {
	
	final static Logger log=Logger.getLogger(LoggerExample.class);

	public static void main(String[] args) {
		printMyPaymentCard('D');
	}
		

	
	
	public static void printMyPaymentCard(char payment){
		
		switch(payment){

		
		case'V':
			log.trace("trace message!"+ "you hane selected VISA card for your payment");
			log.debug("debug message!"+ "you hane selected VISA card for your payment");
			log.info("info message!"+ "you hane selected VISA card for your payment");
			log.warn("warn message!"+ "you hane selected VISA card for your payment");
			log.error("error message!"+ "you hane selected VISA card for your payment");
			break;
		case'M':
			log.trace("trace message!"+ "you hane selected MASTER card for your payment");
			log.debug("debug message!"+ "you hane selected MASTER card for your payment");
			log.info("info message!"+ "you hane selected MASTER card for your payment");
			log.warn("warn message!"+ "you hane selected MASTER card for your payment");
			log.error("error message!"+ "you hane selected MASTER card for your payment" );
			break;
		case'A':
			log.trace("trace message!"+ "you hane selected AMEX card for your payment");
			log.debug("debug message!"+ "you hane selected AMEX card for your payment");
			log.info("info message!"+ "you hane selected AMEX card for your payment");
			log.warn("warn message!"+ "you hane selected AMEX card for your payment");
			log.error("error message!"+ "you hane selected AMEX card for your payment");
			break;
		case'D':
			log.trace("trace message!"+ "you hane selected DISCOVER card for your payment");
			log.debug("debug message!"+ "you hane selected DISCOVER card for your payment");
			log.info("info message!"+ "you hane selected DISCOVER card for your payment");
			log.warn("warn message!"+ "you hane selected DISCOVER card for your payment");
			log.error("error message!"+ "you hane selected DISCOVER card for your payment");
			break;
		default:
			log.trace("trace message!"+ "you are paying by CASH");
			log.debug("debug message!"+ "you are paying by CASH");
			log.info("info message!"+ "you are paying by CASH");
			log.warn("warn message!"+ "you are paying by CASH");
			log.error("error message!"+ "you are paying by CASH");
	}
	}

}
