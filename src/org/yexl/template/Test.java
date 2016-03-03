package org.yexl.template;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LifeTemplate l = new LifeTemplate(){

			@Override
			protected void study() {
				System.out.println("study cs");
				
			}

			@Override
			protected void dinner() {
				System.out.println("eat pizza");
				
			}
			
		};
		
		l.day();
	}

}
