package com.digitek.business;

public class CondisionalDataTypes {
	
	public static void main(String[] args){
		ifElseExamples();
		
		
	}
	//this is if else statement
	public static void ifElseExamples(){
		int no1 = 33;
		int no2 = 11;
		
		int sum = no1+no2;
		
		if (sum<33){
			System.out.println("sum is less then 33 "+ sum);
		}else if (sum>55){
			System.out.println("sum is less then 55");
		}else if (sum==55){
			System.out.println("sum is equal to 55");
		}else {
			System.out.println("nothing of the above");

}
	}
}
