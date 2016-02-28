package org.yexl.adapter;

public class Adapter implements Target {
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	private Adaptee adaptee;
	
	@Override
	public void handleRequest() {
		adaptee.request();

	}

}
