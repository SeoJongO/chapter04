package com.javaex.ex02;
public class MyList {
	
	private Object[] oArray;
	private int oPos;
	
	public MyList() {
		this.oArray = new Object[3];
		oPos = 0;
	}
	
	public void add(Object object) {
		oArray[oPos] = object;
		oPos++;
	}
	
	public int size() {
		return oPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
	
	public void remove(int i) {
		
	}

}
