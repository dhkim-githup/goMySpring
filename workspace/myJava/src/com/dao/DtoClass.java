package com.dao;

public class DtoClass {
	
	String strOwner, strName, strMaker, strHome;
	int iPrice;
	
	public DtoClass(String owner, String name, String maker, String home, int price) {
		// TODO Auto-generated constructor stub
		this.strOwner = owner;
		this.strName = name;
		this.strMaker= maker;
		this.strHome = home;
		this.iPrice = price;		
	}

	public String getStrOwner() {
		return strOwner;
	}

	
	public String getStrName() {
		return strName;
	}

	public String getStrMaker() {
		return strMaker;
	}
	
	public String getStrHome() {
		return strHome;
	}

	
	public int getiPrice() {
		return iPrice;
	}	

}
