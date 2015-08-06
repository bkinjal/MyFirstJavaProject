package com.digitek.polymorphism;

public class OverrideTester {

	public static void main(String[] args) {
		
		WirelessPlan parentObj = new WirelessPlan();
		parentObj.calls();
		parentObj.data();
		parentObj.textMessage();
		
		AttWireless attWirelessObj = new AttWireless();
		attWirelessObj.calls();
		attWirelessObj.data();
		attWirelessObj.textMessage();
		
		TmobileWireless tmobileWirelessObj = new TmobileWireless();
		tmobileWirelessObj.calls();
		tmobileWirelessObj.data();
		tmobileWirelessObj.textMessage();
		
		BoostMobile boostMobileObj = new BoostMobile();
		boostMobileObj.data();
		boostMobileObj.textMessage();
		boostMobileObj.calls();
		
		

	}

}
