package model;

import view.MainFrame;

public abstract class Mechanical{
	
	private String name;
	private String spacialization;
	private String idWork;
	
	public Mechanical(String name, String specialization, String idWork) {
		this.name=name;
		this.spacialization=specialization;
		this.idWork=idWork;
	}

	
public abstract String getType();
public String getName() {
	return  this.name;
}

public String presentation() {
		return "Hello, my name is  " + this.name + ", I am a " +
				getType() + ", id: " + 
				this.idWork + " and my specialization is " +
				this.spacialization + ".";
	}	



}
