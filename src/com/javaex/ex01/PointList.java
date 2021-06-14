package com.javaex.ex01;

import java.util.Arrays;

public class PointList {

	private Point[] pArray;
	private int pPos = 0;

	public PointList() {
		this.pArray = new Point[3];
	}

	public void add(Point point) {
		pArray[pPos] = point;
		pPos++;
		
	}

	public int size() {
		return pPos;
	}

	public Point get(int index) {
		return pArray[index];
	}

	public void remove(int i) {
		
	}

	@Override
	public String toString() {
		return "PointList [pArray=" + Arrays.toString(pArray) + ", pPos=" + pPos + "]";
	}

}
