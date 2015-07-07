package com.digitek.business;

import org.apache.log4j.Logger;

public class SwitchStatment {
	
	final static Logger log=Logger.getLogger(Logger.class);
	
	public static void main(String[] args){
		printMyPaymentCard('V');
		

		}
	
	public static void printMyPaymentCard(char paymentCard){
		switch(paymentCard){
		
		case'V':
			System.out.println("you hane selected VISA card for your payment");
			log.trace("trace message!"+ paymentCard);
			log.debug("debug message!"+ paymentCard);
			log.info("info message!"+ paymentCard);
			log.warn("warn message!"+ paymentCard);
			log.error("error message!"+ paymentCard);
			break;
		case'M':
			System.out.println("you hane selected MASTER card for your payment");
			log.trace("trace message!"+ paymentCard);
			log.debug("debug message!"+ paymentCard);
			log.info("info message!"+ paymentCard);
			log.warn("warn message!"+ paymentCard);
			log.error("error message!"+paymentCard );
			break;
		case'A':
			System.out.println("you hane selected AMEX card for your payment");
			log.trace("trace message!"+ paymentCard);
			log.debug("debug message!"+ paymentCard);
			log.info("info message!"+ paymentCard);
			log.warn("warn message!"+ paymentCard);
			log.error("error message!"+ paymentCard);
			break;
		case'D':
			System.out.println("you hane selected DISCOVER card for your payment");
			log.trace("trace message!"+ paymentCard);
			log.debug("debug message!"+ paymentCard);
			log.info("info message!"+ paymentCard);
			log.warn("warn message!"+ paymentCard);
			log.error("error message!"+ paymentCard);
			break;
		default:
			System.out.println("you are paying by CASH");
			log.trace("trace message!"+ paymentCard);
			log.debug("debug message!"+ paymentCard);
			log.info("info message!"+ paymentCard);
			log.warn("warn message!"+ paymentCard);
			log.error("error message!"+ paymentCard);
			
			
		}
			
			
		}
	}


