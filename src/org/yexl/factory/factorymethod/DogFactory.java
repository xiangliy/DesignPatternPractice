package org.yexl.factory.factorymethod;

public class DogFactory implements AnimalFactory {

	@Override
	public Animal getAnimal() {
		return new Dog();
	}

}
