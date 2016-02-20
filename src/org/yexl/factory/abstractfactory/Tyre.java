package org.yexl.factory.abstractfactory;

public interface Tyre {
	void tyreKind();
}

class LuxuryTyre implements Tyre{

	@Override
	public void tyreKind() {
		System.out.println("good Tyre");
		
	}
	
}

class NormalTyre implements Tyre{

	@Override
	public void tyreKind() {
		System.out.println("normal Tyre");
		
	}
	
}