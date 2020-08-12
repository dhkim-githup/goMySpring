package com.dao;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaoClass dao = new DaoClass();
		ArrayList<DtoClass> list = dao.selCar();
		
		
		for (int i = 0; i < list.size(); i++) {
			
			//System.out.print("Owner : " +  list.get(i));
			
			DtoClass dto = list.get(i); // 해당 인덱스의 객체를 리턴 
			
			System.out.print("Owner : " + dto.getStrOwner());
			System.out.print(", Name : " + dto.getStrName());
			System.out.print(", Price : " + dto.getiPrice());
			System.out.print(", Maker : " + dto.getStrMaker());
			System.out.println(", Home : " + dto.getStrHome());
		}

	}

}
