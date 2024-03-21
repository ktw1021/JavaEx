package com.javaex.oop.goods.v2;

public class GoodsExApp {

	public static void main(String[] args) {
		GoodsEx notebook = new GoodsEx("LG그램",900000, 2);
		GoodsEx cup = new GoodsEx("머그컵",2000, 1);
		
		System.out.printf("%s은 %,d원입니다.%n",notebook.name,notebook.price);
		System.out.printf("%s은 %,d원입니다.%n",cup.name,cup.price);
	}
	

}
