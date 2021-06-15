package com.javaex.ex04;

import java.util.ArrayList;

public class PointApp {

	public static void main(String[] args) {

		ArrayList<Point> pList = new ArrayList<Point>();

		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 4);
		Point p03 = new Point(5, 6);
		Point p04 = new Point(7, 8);

		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		pList.add(p04);

		System.out.println("=================================");

		System.out.println(pList.size());

		System.out.println("=================================");

		Point p = pList.get(0);
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p); // toString()

		System.out.println("=================================");

		for (int i = 0; i < pList.size(); i++) {
			Point pp = pList.get(i);
			System.out.println(pp);
		}

		System.out.println("=================================");

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).getX());
		}

		System.out.println("=================================");
		
		System.out.println(pList);
		pList.add(1, p04);	// pList[1]에 p04가 들어감
		System.out.println(pList);
		pList.remove(1);	// pList[1]를 삭제
		System.out.println(pList);
		
		System.out.println("=================================");
		 
		for(Point ppp : pList) { // 향상된 for문
			System.out.println(ppp);
			System.out.print("x="+ppp.getX()+" y="+ppp.getY()+"\n");
		}
		
		// pList에 원 추가
		Circle c01 = new Circle(100);
		// pList.add(c01); 원은 추가할 수 없다
		
		
		
		
		
	}

}
