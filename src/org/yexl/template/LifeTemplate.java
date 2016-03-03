package org.yexl.template;

public abstract class LifeTemplate {
	private void breakfast(){
		System.out.println("eat breakfast");
	}
	
	abstract protected void study();
	
	private void lunch(){
		System.out.println("eat lunch");
	}
	
	abstract protected void dinner();
	
	private void sleep(){
		System.out.println("zzz");
	}
	
	public final void day(){
		breakfast();
		study();
		lunch();
		study();
		dinner();
		sleep();
	}
}
