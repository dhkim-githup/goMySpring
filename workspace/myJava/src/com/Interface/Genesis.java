package com.Interface;

public class Genesis implements Car {
	
	String sCar ="Genesis"  ; // Car Name
	int    iPrice = 40000000 ; // Car Price
	String sMaker ="Çö´ë"; // Car Maker	
	
	
	@Override
	public String carOwner() {
		// TODO Auto-generated method stub
		return "Owner is "+Car.sName;
	}
	
	@Override
	public String carName() {
		// TODO Auto-generated method stub
		return "Car name is "+this.sCar;
	}
	
	@Override
	public String carPrice() {
		// TODO Auto-generated method stub		
		return "Car Price is "+this.iPrice;
	}
	
	@Override
	public String carHome() {
		// TODO Auto-generated method stub
		return "Car home is "+Car.sHome;
	}

}
