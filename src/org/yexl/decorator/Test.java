package org.yexl.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.move();
		
		FlyCar flycar = new FlyCar(car);
		flycar.move();
		
		WaterCar waterflycar = new WaterCar(new FlyCar(car));
		waterflycar.move();
		
		// Java IO stream is decorator?
	}
}
