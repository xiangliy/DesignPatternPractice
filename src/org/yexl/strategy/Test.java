package org.yexl.strategy;

public class Test {

	public static void main(String[] args) {
		Strategy cat = new Cat();
		Context c = new Context(cat);
		c.IloveAnimal();

		Strategy dog = new Dog();
		c = new Context(dog);
		c.IloveAnimal();
	}

}
