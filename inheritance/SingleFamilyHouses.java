package com.digitek.inheritance;

public class SingleFamilyHouses extends RealEstate {
	
	//Family Room
	public void familyRoom(){
		System.out.println("SingleFamilyHouse - familyRoom");
		
	}
	//Wood Patio
	public void woodPatio(){
		System.out.println("SingleFamilyHouse - woodPatio");
		
	}
	
	public void twoCarGarage(){
		System.out.println("SingleFamilyHouses - twoCarGarage");
	}
	
	public static void main(String[] args){
		SingleFamilyHouses singleFamilyHouse =new SingleFamilyHouses();
		
		singleFamilyHouse.familyRoom();
		singleFamilyHouse.woodPatio();
		singleFamilyHouse.twoCarGarage();
		
		//From Parent Class
		singleFamilyHouse.listSalePrice();
		singleFamilyHouse.bedRooms();
		singleFamilyHouse.bathRooms();
		singleFamilyHouse.kitchen();
		singleFamilyHouse.finishedSqFt();
		singleFamilyHouse.description();
		singleFamilyHouse.propertyType();
		singleFamilyHouse.exposure();
		singleFamilyHouse.community();
		singleFamilyHouse.community();
		singleFamilyHouse.yearBuild();
		singleFamilyHouse.lotSize();
		singleFamilyHouse.propertyTax();
		
		
		
	}
	

}
