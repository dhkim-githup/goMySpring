package com.extend;

public class Sonata extends Car {
	
	String sCar ="�ҳ�Ÿ"  ; // Car Name
	int    iPrice = 30000000 ; // Car Price
	String sMaker ="����"; // Car Maker
		
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
