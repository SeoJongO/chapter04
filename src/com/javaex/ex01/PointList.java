package com.javaex.ex01;

public class PointList {

	public static void main(String[] args) {
		
		Point[] pArray = new Point[2];

		Point p01 = new Point(2, 2);
		Point p02 = new Point(3, 3);

		pArray[0] = p01;
		pArray[1] = p02;

		for (int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i]);
		}

	}

}
