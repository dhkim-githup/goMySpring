package com.ver2;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void testK() {
		Tire kt = new KoreaTire();
		Car car = new Car(kt);
		
		System.out.println("타이어 Brand"+car.getTireBrand());
	}
	
	@Test
	public void testA() {
		// TODO Auto-generated method stub
		Tire at = new AmericaTire();
		Car car = new Car(at);
		
		System.out.println("타이어 Brand"+car.getTireBrand());

	}

}
