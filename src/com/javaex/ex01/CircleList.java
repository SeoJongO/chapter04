package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {

	private Circle[] cArray;
	private int cPos = 0;
	
	public CircleList() {
		this.cArray = new Circle[3];
	}
	
	public void add(Circle circle) {
		cArray[cPos] = circle;
		cPos++;
	}
	
	public int size() {
		return cPos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}
	
	public void remove(int i) {
		
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", cPos=" + cPos + "]";
	}
	
	
}
