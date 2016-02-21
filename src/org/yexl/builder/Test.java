package org.yexl.builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director d = new MyDirector(new MyComputerBuilder());
		
		Computer c = d.directComputer();
		
		System.out.println(c.getKeyboard().getName());
	}

}
