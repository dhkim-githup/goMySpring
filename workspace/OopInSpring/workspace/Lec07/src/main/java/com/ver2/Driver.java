package com.ver2;

public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tire kt = new KoreaTire();
		//Tire at = new AmericaTire();
		
		Car car = new Car(kt);
		System.out.println("Å¸ÀÌ¾î Brand"+car.getTireBrand());

	}

}
