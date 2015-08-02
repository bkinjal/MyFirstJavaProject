package com.digitek.inheritance;

public class RanchHouses extends RealEstate {
	
	
	//Extended Sun Room
	public void sunRoom(){
		System.out.println("RanchHouses - sunRoom");
		
	}
	
	//Car Garage
	public void oneCarGarage(){
		System.out.println("RanchHouses - oneCarGarage");
		
	}
	
	public static void main(String[] args){
		RanchHouses ranchHouses = new RanchHouses();
		
		ranchHouses.sunRoom();
		ranchHouses.oneCarGarage();
		
		//From Parent Class
		ranchHouses.listSalePrice();
		ranchHouses.bedRooms();
		ranchHouses.bathRooms();
		ranchHouses.kitchen();
		ranchHouses.finishedSqFt();
		ranchHouses.description();
		ranchHouses.propertyType();
		ranchHouses.exposure();
		ranchHouses.community();
		ranchHouses.community();
		ranchHouses.yearBuild();
		ranchHouses.lotSize();
		ranchHouses.propertyTax();
		
	}

}
