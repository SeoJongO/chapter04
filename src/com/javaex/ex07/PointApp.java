package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,4);
		Point p03 = new Point(5,6);
		
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		System.out.println(pSet);
		
//		for ( Point p : pSet ) {
//			System.out.println(p);
//		}
		
		Point p04 = new Point(3,4);
		pSet.add(p04);
		System.out.println(pSet);
		 
		System.out.println(p02.equals(p04));
		System.out.println(p02==p04);
		
		System.out.println(p01.equals(p04));
		System.out.println(p01==p04);
		
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
	}

}
