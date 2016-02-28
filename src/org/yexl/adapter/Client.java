package org.yexl.adapter;

public class Client {
	public void test1(Target t){
		t.handleRequest();
	}
	
	public static void main(String[] args){
		Client c = new Client();
		Adaptee adaptee = new Adaptee();
		
		Target t = new Adapter(adaptee);
		
		c.test1(t);
	}
}
