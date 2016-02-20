package org.yexl.singleton;

public class Singleton03 {
	private Singleton03(){
		
	}
	
	// inner class effecient and lazy, this seems the best way
	private static class SingletonInnerClass{
		private static final Singleton03 instance = new Singleton03();
	}
	
	public static Singleton03 getInstance(){
		return SingletonInnerClass.instance;
	}
}
