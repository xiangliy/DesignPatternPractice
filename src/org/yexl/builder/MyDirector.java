package org.yexl.builder;

public class MyDirector implements Director {
	
	private MyComputerBuilder builder;

	public MyDirector(MyComputerBuilder builder) {
		super();
		this.builder = builder;
	}

	@Override
	public Computer directComputer() {
		// TODO Auto-generated method stub
		Monitor m = builder.buildMonitor();
		Keyboard k = builder.buildKeyboard();
		Cpu c = builder.buildCpu();
		
		Computer computer = new Computer();
		
		computer.setCpu(c);
		computer.setKeyboard(k);
		computer.setMonitor(m);
		return computer;
	}

}
