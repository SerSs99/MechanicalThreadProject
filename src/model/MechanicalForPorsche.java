package model;

import view.MainFrame;

public class MechanicalForPorsche extends Mechanical
		implements Runnable{
	public MechanicalForPorsche(String name, String specialization, String idWork) {
		super(name, specialization, idWork);
	}

	@Override
	public String getType() {
		return "Porsche mechanical";
	}
	
	@Override
	public void run() {
		System.out.println(this.getName() + " starts his work.");
		System.out.println(this.presentation());
	    System.out.println(this.getName()+" is taking the car for a !short ride.");
		System.out.println(this.getName() + " finished his Work" );
	}
}
