package com.Interface;

public class K7  implements Car {	
	
	String sName ="dhkim";
	String sCar ="K7"  ; // Car Name
	int    iPrice = 35000000 ; // Car Price
	String sMaker ="±â¾Æ"; // Car Maker
	
	
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
