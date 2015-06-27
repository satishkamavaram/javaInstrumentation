package com.satish.javaInstrumentation;

public class Test {

	public void gotoSleep1s()
	{
		System.out.println("gotoSleep1s method execution started : ");
		try {
			Thread.sleep(1000);
			//System.out.println(this.getClass().getEnclosingMethod().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("gotoSleep1s method execution ended : ");
	}
	
	public void gotoSleep10s()
	{
		System.out.println("gotoSleep10s method execution started : ");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("gotoSleep10s method execution ended : ");
	}
}
