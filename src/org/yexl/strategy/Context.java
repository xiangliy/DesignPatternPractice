package org.yexl.strategy;

public class Context {
	
	private Strategy s;
	public Strategy getS() {
		return s;
	}

	public void setS(Strategy s) {
		this.s = s;
	}

	public Context(Strategy s) {
		super();
		this.s = s;
	}

	public void IloveAnimal(){
		s.printLovelyAnimal();
	}
}
