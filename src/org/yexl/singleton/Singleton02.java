package org.yexl.singleton;

public class Singleton02 {
	private static Singleton02 instance = null;
	
	private Singleton02(){
		
	}
	
	//lazy load, synchronized keyword not very efficient.
	public static synchronized Singleton02 getInstance(){
		if(instance == null){
			instance = new Singleton02();
		}
		
		return instance;
	}
}
