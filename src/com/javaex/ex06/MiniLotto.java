package com.javaex.ex06;

import java.util.HashSet; // 순서 없음
import java.util.Set;
import java.util.TreeSet; // 자동 정렬

public class MiniLotto {

	public static void main(String[] args) {

		Set<Integer> Lotto1 = new TreeSet<Integer>();
		Set<Integer> Lotto2 = new HashSet<Integer>();
		Set<Integer> LottoSet = new HashSet<Integer>();

		while (Lotto1.size() < 6) {
			Lotto1.add((int) (Math.random() * 64));
		}

		while (Lotto2.size() < 6) {
			Lotto2.add((int) (Math.random() * 64));
		}

		while (LottoSet.size() < 6) {
			int num = (int) (Math.random() * 64);
			System.out.print(num + " ");
			LottoSet.add(num);
		}
		System.out.print("\n");
		
		System.out.print(Lotto1);
		System.out.println(" 자동 정렬 TreeSet");
		System.out.print(Lotto2);
		System.out.println(" 순서 없음 HashSet");
		System.out.println(LottoSet);

	}

}
