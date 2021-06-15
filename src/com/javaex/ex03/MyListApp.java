package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		// 포인트 리스트로 관리
		MyList<Point> pList = new MyList<Point>(); // 제네릭

		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 4);
//		Circle c03 = new Circle(10);

		pList.add(p01);
		pList.add(p02);
//		pList.add(c03); 다른 인스턴스도 들어감 --> 오류 발생 해야함

		for (int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}

	}

}
