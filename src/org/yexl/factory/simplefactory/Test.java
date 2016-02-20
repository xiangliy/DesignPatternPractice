package org.yexl.factory.simplefactory;

public class Test {

	//not compatible with Open-Close Principle, but also a good way
	//simpler, maybe better than factorymethod, mostly because it is simple
	public static void main(String[] args) {
		Animal dog = AnimalFactory.getAnimal("Dog");
		Animal panda = AnimalFactory.getAnimal("Panda");
		
		dog.who();
		panda.who();
	}

}
