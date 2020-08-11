package com.extend;

public class K7  extends Car {
	
	
	String sCar ="K7"  ; // Car Name
	int    iPrice = 35000000 ; // Car Price
	String sMaker ="±â¾Æ"; // Car Maker
	
	
	@Override
	public String carOwner() {
		// TODO Auto-generated method stub
		return super.carOwner();
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
		return super.carHome();
	}


}
