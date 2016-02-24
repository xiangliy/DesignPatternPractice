package org.yexl.command;

public class Test {

	public static void main(String[] args) {
		Command command = new ConcreteCommand(new Receiver());
		
		Invoke i = new Invoke(command);
		
		i.call();
		
		//maybe used in database transaction
	}

}
