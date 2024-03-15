package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchPractice1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		
		double score = scanner.nextDouble();
		
		if (score%3==0) {
		System.out.println("3의 배수입니다."); 
		}
		else {
			System.out.println( score +"은 " + "3의 배수가 아닙니다.");
		}
		scanner.close();
	}

}
