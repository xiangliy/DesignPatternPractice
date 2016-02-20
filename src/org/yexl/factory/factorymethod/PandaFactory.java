package org.yexl.factory.factorymethod;

public class PandaFactory implements AnimalFactory {

	@Override
	public Animal getAnimal() {
		// TODO Auto-generated method stub
		return new Panda();
	}

}
