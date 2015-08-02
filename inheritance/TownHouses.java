package com.digitek.inheritance;

public class TownHouses extends RealEstate{
	
	
	//Two Stories
	public void twoStories(){
		System.out.println("TownHouses - twoStories");
		
	}
	
	//One Car Garage
	public void attachOneCarGarage(){
		System.out.println("TownHouses - attachOneCarGarage");
		
	}
	
	public static void main(String[] args){
		TownHouses townHouses = new TownHouses();
		
		townHouses.twoStories();
		townHouses.attachOneCarGarage();
		//From Parent Class
		townHouses.listSalePrice();
		townHouses.bedRooms();
		townHouses.bathRooms();
		townHouses.kitchen();
		townHouses.finishedSqFt();
		townHouses.description();
		townHouses.propertyType();
		townHouses.exposure();
		townHouses.community();
		townHouses.community();
		townHouses.yearBuild();
		townHouses.lotSize();
		townHouses.propertyTax();
		
	}

}

