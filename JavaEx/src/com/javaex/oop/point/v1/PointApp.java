package com.javaex.oop.point.v1;

public class PointApp {

	public static void main(String[] args) {
		
		Point draw1 = new Point();
		Point draw2 = new Point();
		
		draw1.setX(5);
		draw1.setY(5);
		
		draw2.setX(10);
		draw2.setY(23);
		
		draw1.draw(draw1.getX(),draw1.getY());
		draw2.draw(draw2.getX(),draw2.getY());
		
	}

}
