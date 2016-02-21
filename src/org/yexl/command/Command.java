package org.yexl.command;

public interface Command {
	void execute();
}

class ConcreteCommand implements Command{
	
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		//log
		receiver.action();
		//other
	}
	
}
