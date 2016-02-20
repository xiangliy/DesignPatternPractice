package org.yexl.singleton;

public class Singleton01 {
	private static Singleton01 instance = new Singleton01();
	
	private Singleton01(){
		
	}
	
	//basic, but not lazy loading.
	public static Singleton01 getInstance(){
		return instance;
	}
}
