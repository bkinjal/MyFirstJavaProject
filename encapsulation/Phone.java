package com.digitek.encapsulation;

public class Phone {
	
	private int network;
	private String color;
	private String model;
	private String data;
	private int speed;
	
	
	public int getNetwork() {
		return network;
	}
	public void setNetwork(int network) {
		if(network > 4)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		this.network = network;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 2)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		this.speed = speed;
	}
	
    public Phone(){
		
	}
	public void changeNetwork(){
		
	}
	public void changeSpeed(){
		
	}
	
	@Override
	public String toString() {
		
		return "Phone [network=" + network + ", color=" + color + ", model="
				+ model + ", speed=" + speed + ", data=" + data+",]";
	}
		
	
	


}
