package com.Interface;

public class Sonata implements Car {
	
	String sCar ="�ҳ�Ÿ"  ; // Car Name
	int    iPrice = 30000000 ; // Car Price
	String sMaker ="����"; // Car Maker
		
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
