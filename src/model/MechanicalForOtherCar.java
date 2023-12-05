package model;

import view.MainFrame;

public class MechanicalForOtherCar extends Mechanical
		implements Runnable{
	
	public MechanicalForOtherCar(String name, String specialization, String idWork) {
		super(name, specialization, idWork);
	}

	@Override
	public String getType() {
		return "Mechanical for other car";
	}
	
	@Override
	public void run() {
		
		
		System.out.println(this.getName() + " starts his work.");
		System.out.println(this.presentation());
		System.out.println(this.getName() + " finished his Work" );
	}
	}


