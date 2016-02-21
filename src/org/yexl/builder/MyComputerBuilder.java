package org.yexl.builder;

public class MyComputerBuilder implements ComputerBuilder {

	@Override
	public Monitor buildMonitor() {
		System.out.println("build my monitor");
		return new Monitor("my monitor");
	}

	@Override
	public Keyboard buildKeyboard() {
		System.out.println("build my keyboard");
		return new Keyboard("my keyboard");
	}

	@Override
	public Cpu buildCpu() {
		System.out.println("build my cpu");
		return new Cpu("my Cpu");
	}

}
