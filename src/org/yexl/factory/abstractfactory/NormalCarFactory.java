package org.yexl.factory.abstractfactory;

public class NormalCarFactory implements CarFactory {

	@Override
	public Engine createEngine() {
		// TODO Auto-generated method stub
		return new NormalEngine();
	}

	@Override
	public Seat createSeat() {
		// TODO Auto-generated method stub
		return new NormalSeat();
	}

	@Override
	public Tyre createTyre() {
		// TODO Auto-generated method stub
		return new NormalTyre();
	}

}
