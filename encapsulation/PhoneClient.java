package com.digitek.encapsulation;

public class PhoneClient {

	public static void main(String[] args) {
		Phone phoneObj1 = new Phone();
		phoneObj1.setNetwork(4);
		phoneObj1.setColor("Space Gray");
		phoneObj1.setModel("IPhone6");
		phoneObj1.setData("Data use");
		phoneObj1.setSpeed(10);
		System.out.println("phoneObj1:" + phoneObj1);
		
		Phone phoneObj2 = new Phone();
		phoneObj2.setNetwork(3);
		phoneObj2.setColor("Space Gray");
		phoneObj2.setModel("IPhone6");
		phoneObj2.setData("Data use");
		phoneObj2.setSpeed(5);
		System.out.println("phoneObj2:" + phoneObj2);
		
		Phone phoneObj3 = new Phone();
		phoneObj3.setNetwork(1);
		phoneObj3.setColor("Space Gray");
		phoneObj3.setModel("IPhone6");
		phoneObj3.setData("No Data use");
		phoneObj3.setSpeed(1);
		System.out.println("phoneObj3:" + phoneObj3);
		
		
		
		
		

	}

}
