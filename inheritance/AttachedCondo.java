package com.digitek.inheritance;

public class AttachedCondo extends RealEstate{
	
	
	//Fifteen Stories Building
	public void fifteenStoriesBuilding(){
		System.out.println("AttacheCondo - fifteenStoriesBuilding");
		
	}
	//One Parking Spot
	public void onePrivateParking(){
		System.out.println("AttachedCondo - onePrivateParking");
		
	}
	
	public static void main(String[] args){
		AttachedCondo attachedCondo = new AttachedCondo();
		
		attachedCondo.onePrivateParking();
		attachedCondo.fifteenStoriesBuilding();
		//From Parent Class
		attachedCondo.listSalePrice();
		attachedCondo.bedRooms();
		attachedCondo.bathRooms();
		attachedCondo.kitchen();
		attachedCondo.finishedSqFt();
		attachedCondo.description();
		attachedCondo.propertyType();
		attachedCondo.exposure();
		attachedCondo.community();
		attachedCondo.community();
		attachedCondo.yearBuild();
		attachedCondo.lotSize();
		attachedCondo.propertyTax();
		
	}

}
