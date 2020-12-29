package com.ver5.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* user comver4Driver.xml
		ApplicationContext context = new ClassPathXmlApplicationContext("comver4Driver.xml");
		
		Car car = context.getBean("car", Car.class);
		Tire tire = context.getBean("tire", Tire.class);
		
		car.setTire(tire);
		System.out.println("타이어 Brand"+car.getTireBrand());
		*/ 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DriverResource.xml");
				
				Car car = context.getBean("car", Car.class);
				System.out.println("타이어 Brand"+car.getTireBrand());

	}

}
