package com.ver3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void testK() {
		Tire kt = new KoreaTire();
		Car car = new Car();
		car.setTire(kt);
		
		System.out.println("타이어 Brand"+car.getTireBrand());
	}
	
	@Test
	public void testA() {
		// TODO Auto-generated method stub
		Tire at = new AmericaTire();
		Car car = new Car();
		car.setTire(at);
		
		System.out.println("타이어 Brand"+car.getTireBrand());

	}

}
