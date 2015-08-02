package com.digitek.inheritance;

public class RealEstate {
	
	// steps
	
	  //Price for sale
	public void listSalePrice(){
		System.out.println("Parent Class - listSalePrice");
		
	}
	
	  //No of BedRooms
	public void bedRooms(){
		System.out.println("Parent Class - bedRooms");
		
	}
	
	  //No of BathRooms
	public void bathRooms(){
		System.out.println("Parent Class - bathRooms");
		
	}
	
	  //Kitchen
	public void kitchen(){
		System.out.println("Parent Class - kitchen");
		
	}
	
	  //Sq Ft
	public void finishedSqFt(){
		System.out.println("Parent Class - finishedSqFt");
		
	}
	
	  //Description
	public void description(){
		System.out.println("Parent Class - description");
		
	}
	
	  //Property Type
	public void propertyType(){
		System.out.println("Parent Class - propertyType");
		
	}
	
	  //Exposure
	public void exposure(){
		System.out.println("Parent Class - exposure");
		
	}
	
	  //Community
	public void community(){
		System.out.println("Parent Class - community");
		
	}
	
	  //County
	public void county(){
		System.out.println("Parent Class - county");
		
	}
	
	  //Year Built
	public void yearBuild(){
		System.out.println("Parent Class - yearBuild");
		
	}
	
	  //Lot Size
	public void lotSize(){
		System.out.println("Parent Class - lotSize");
		
	}
	
	  //Property Tax
	public void propertyTax(){
		System.out.println("Parent Class - propertyTax");
		
	}
	
	public static void main(String[] args){
		RealEstate realEstate = new RealEstate();
		
		//From Current Class
		realEstate.listSalePrice();
		realEstate.bedRooms();
		realEstate.bathRooms();
		realEstate.kitchen();
		realEstate.finishedSqFt();
		realEstate.description();
		realEstate.propertyType();
		realEstate.exposure();
		realEstate.community();
		realEstate.community();
		realEstate.yearBuild();
		realEstate.lotSize();
		realEstate.propertyTax();
		
		
		
	}
	
	  
	  
	  

}
