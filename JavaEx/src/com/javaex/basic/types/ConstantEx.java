package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		final double PI = 3.141592; 
		final int SPEED_LIMIT = 110;
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + "km입니다.");
	}

}
