package com.object;

public class MainClassOop {
	

	public static void main(String[] args) {
	
		Genesis gen = new Genesis();
		K7 k7       = new K7();
		Sonata so   = new Sonata();
		
		System.out.println(gen.carGrade());
		System.out.println(gen.carSize());
		
		System.out.println(k7.carGrade());
		System.out.println(k7.carSize());
		
		System.out.println(so.carGrade());
		System.out.println(so.carSize());
	
	}
	
}
