package com.Interface;


public class MainClassInterface {

	public static void main(String[] args) {
		
	
	Car gen = new Genesis();
	Car k7  = new K7();
	Car so  = new Sonata();
	
	System.out.println(gen.carOwner());
	System.out.println(gen.carName());
	System.out.println(gen.carPrice());
	System.out.println(gen.carHome());

	
	System.out.println(k7.carOwner());
	System.out.println(k7.carName());
	System.out.println(k7.carPrice());
	System.out.println(k7.carHome());
	
	System.out.println(so.carOwner());
	System.out.println(so.carName());
	System.out.println(so.carPrice());
	System.out.println(so.carHome());

	}
	
}
