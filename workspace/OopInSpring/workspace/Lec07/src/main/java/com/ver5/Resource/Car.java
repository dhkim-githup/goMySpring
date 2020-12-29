package com.ver5.Resource;

import javax.annotation.Resource;


public class Car {
	
		@Resource
		Tire tire;

		
		public String getTireBrand() {
			// TODO Auto-generated method stub
			return "ÀåÂøµÈ Tire :" + tire.getBrand();
		}
		
		
}
