package com.lombokTest;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class LombokTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User2 user = new User2();
		
		user.setName("Kim");
		user.setAge(20);
		user.setSex("Male");
		System.out.println(user.toString());
		
		System.out.println("Dhkim =>"+user.getName());

	}

}

@Getter
@Setter
@ToString
class User2{
	private String name;
	private int age;
	private String sex;
		
}