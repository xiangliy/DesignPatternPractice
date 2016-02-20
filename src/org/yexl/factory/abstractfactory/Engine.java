package org.yexl.factory.abstractfactory;

public interface Engine {
	void run();
	void start();
}

class LuxuryEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Engine run fast");
	}

	@Override
	public void start() {
		System.out.println("Engine start fast");
	}
}

class NormalEngine implements Engine{

	@Override
	public void run() {
		System.out.println("Engine run normal");
	}

	@Override
	public void start() {
		System.out.println("Engine start normal");
	}
	
}
