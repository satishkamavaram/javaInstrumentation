package com.satish.javaInstrumentation;

public class Main {

	public static void main(String[] args) {
	
		Test t = new Test();
		t.gotoSleep10s();
		t.gotoSleep1s();

	}

}
