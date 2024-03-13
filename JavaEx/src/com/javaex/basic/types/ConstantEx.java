package com.javaex.basic.types;

public class ConstantEx {

	public static void main(String[] args) {
		final double PI = 3.141592; 
		final int SPEED_LIMIT = 110;
		
		System.out.println(PI);
		System.out.println(SPEED_LIMIT);
		
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + "km입니다.");
		System.out.println("제한 속도 이하로 주행해주세요.");
		
		// 상수의 사용 목적
		// 1. 코드 가독성을 높인다.
		// 2. 특정 데이터를 한 곳에서 일괄 관리한다. 
		
	}

}
