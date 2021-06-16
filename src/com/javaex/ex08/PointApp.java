package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {

//		List<Point> pList = new ArrayList<Point>();

		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p01 = new Point(1, 2);
		Point p02 = new Point(3, 4);
		Point p03 = new Point(5, 6);

		pMap.put("정우성", p01);
		pMap.put("유재석", p02);
		pMap.put("이효리", p03);

		System.out.println(pMap.size());
		System.out.println(pMap);
		System.out.println(pMap.get("유재석").getX());

		Point p04 = new Point(7, 8);
		pMap.put("유재석", p04);

		System.out.println(pMap);
		
		Set<String> keys = pMap.keySet();
		
		for(String key : keys) {
//			System.out.println(pMap.get(key).getX());
			System.out.println(pMap.get(key));
		}
		
	}

}
