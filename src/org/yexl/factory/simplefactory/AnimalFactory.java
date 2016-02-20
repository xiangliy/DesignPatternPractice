package org.yexl.factory.simplefactory;

public class AnimalFactory {
	public static Animal getAnimal(String name){
		if("Dog".equals(name)){
			return new Dog();
		}else if("Panda".equals(name)){
			return new Panda();
		}else{
			return null;
		}
	}
}
