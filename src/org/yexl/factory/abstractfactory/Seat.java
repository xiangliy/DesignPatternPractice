package org.yexl.factory.abstractfactory;

public interface Seat {
	void comfortable();
}

class LuxurySeat implements Seat{
	@Override
	public void comfortable() {
		System.out.println("Seat is confortable");
	}
}

class NormalSeat implements Seat{
	@Override
	public void comfortable() {
		System.out.println("Seat is normal");
	}
}
