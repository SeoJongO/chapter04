package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {

		PointList pList = new PointList();
		CircleList cList = new CircleList();
		
		Point p00 = new Point(2, 2);
		Point p01 = new Point(3, 3);
		Point p02 = new Point(4, 4);

		Circle c00 = new Circle(2);
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		
		pList.add(p00);
		pList.add(p01);
		pList.add(p02); 
		
		cList.add(c00);
		cList.add(c01);
		cList.add(c02);
		
		System.out.println("배열크기-------------");
		System.out.println("Point size="+pList.size());
		System.out.println("Circle size="+cList.size());
		
		System.out.println("배열전체출력----------");
		System.out.println(pList);
		System.out.println(cList);
		
		System.out.println("배열부분출력----------");
		System.out.println("Point x="+pList.get(1).getX());
		System.out.println("Point y="+pList.get(1).getY());
		System.out.println("Circle r="+cList.get(1).getRadius());
		
		System.out.println("배열반복출력----------");
		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		for (int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i));
		}
		
		System.out.println("배열삭제-------------");
		pList.remove(1);
		cList.remove(1);
		
		System.out.println("배열추가-------------");
//		Point p03 = new Point(5,5);
//		pList.add(p03);

//		for (int i = 0; i  < pList.length; i++) {
//			System.out.println(pList[i]);
//		}

	}

}
