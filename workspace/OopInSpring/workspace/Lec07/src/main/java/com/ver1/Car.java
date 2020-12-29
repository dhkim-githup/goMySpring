package com.ver1;

public class Car {
	
		Tire tire;
		
		
		public Car() {
			tire = new KoreaTire();
			//tire = new AmericaTire();
		}
		
		public String getTireBrand() {
			// TODO Auto-generated method stub
			return "ÀåÂøµÈ Tire :" + tire.getBrand();
		}
}
