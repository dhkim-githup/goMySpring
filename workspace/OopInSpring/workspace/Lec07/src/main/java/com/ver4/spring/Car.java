package com.ver4.spring;

public class Car {
	
		Tire tire;

		public Tire getTire() {
			return tire;
		}

		public void setTire(Tire tire) {
			this.tire = tire;
		}

		
		public String getTireBrand() {
			// TODO Auto-generated method stub
			return "ÀåÂøµÈ Tire :" + tire.getBrand();
		}
		
		
}
