package com.ver5.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	
		@Autowired
		Tire tire;

		
		public String getTireBrand() {
			// TODO Auto-generated method stub
			return "ÀåÂøµÈ Tire :" + tire.getBrand();
		}
		
		
}
