package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		Integer i01 = 4;
		Integer i02 = 5;
		Integer i03 = 6;

		iSet.add(i01);
		iSet.add(i02);
		iSet.add(i03);

		System.out.println("iSet size=" + iSet.size());

		for (Integer num : iSet) {
			System.out.println(num);
		}

		System.out.println("=======================================");
		
		System.out.println(iSet);
		Integer i04 = 5;
		iSet.add(i04);
		System.out.println(iSet);
		
		System.out.println("=======================================");

	}

}
