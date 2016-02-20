package org.yexl.factory.abstractfactory;

public class Client {

	// so complicated......
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		
		Engine engine = factory.createEngine();
		engine.run();
		engine.start();
	}

}
