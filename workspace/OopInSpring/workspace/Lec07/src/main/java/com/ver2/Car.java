package com.ver2;

public class Car {
	
		Tire tire;
		
		
		public Car(Tire tire) {
			this.tire = tire;
			//tire = new AmericaTire();
		}
		
		public String getTireBrand() {
			// TODO Auto-generated method stub
			return "������ Tire :" + tire.getBrand();
		}
}
