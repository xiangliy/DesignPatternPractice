package org.yexl.decorator;

public interface ICar {
	void move();
}

class Car implements ICar{

	@Override
	public void move() {
		System.out.println("move");
		
	}
}

class GreatCar implements ICar{
	
	public GreatCar(ICar car) {
		super();
		this.car = car;
	}

	private ICar car;

	@Override
	public void move() {
		car.move();
	}
}

class FlyCar extends GreatCar{

	public FlyCar(ICar car) {
		super(car);
	}
	
	public void fly(){
		System.out.println("fly");
	}
	
	@Override
	public void move() {
		super.move();
		fly();
	}
	
}

class WaterCar extends GreatCar{

	public WaterCar(ICar car) {
		super(car);
	}
	
	public void swim(){
		System.out.println("swim");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
}

class AICar extends GreatCar{

	public AICar(ICar car) {
		super(car);
	}
	
	public void automove(){
		System.out.println("automove");
	}
	
	@Override
	public void move() {
		super.move();
		automove();
	}
	
}