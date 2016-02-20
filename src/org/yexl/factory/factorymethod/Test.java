package org.yexl.factory.factorymethod;

public class Test {

	// easy to extend, do not need to modify existing code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new DogFactory().getAnimal();
		Animal panda = new PandaFactory().getAnimal();
		
		dog.who();
		panda.who();
	}

}
