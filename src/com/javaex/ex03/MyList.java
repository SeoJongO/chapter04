package com.javaex.ex03;
public class MyList<T> {
	
	private T[] oArray;
	private int oPos;
	
	public MyList() {
		this.oArray = (T[])new Object[3];
		oPos = 0;
	}
	
	public void add(T object) {
		oArray[oPos] = object;
		oPos++;
	}
	
	public int size() {
		return oPos;
	}
	
	public T get(int index) {
		return oArray[index];
	}
	
	public void remove(int i) {
		
	}

}
