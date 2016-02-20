package org.yexl.singleton;

public class TestAll {

	public static void main(String[] args) {
		Singleton01 instance1 = Singleton01.getInstance();
		Singleton01 instance2 = Singleton01.getInstance();
		
		System.out.println(instance1);
		System.out.println(instance2);
		
		Singleton02 instance3 = Singleton02.getInstance();
		Singleton02 instance4 = Singleton02.getInstance();
		
		System.out.println(instance3);
		System.out.println(instance4);
		
		Singleton03 instance5 = Singleton03.getInstance();
		Singleton03 instance6 = Singleton03.getInstance();
		
		System.out.println(instance5);
		System.out.println(instance6);
		
		System.out.println(Singleton04.INSTANCE);
		System.out.println(Singleton04.INSTANCE);
	}

}
