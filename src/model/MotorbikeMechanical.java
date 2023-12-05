package model;

public class MotorbikeMechanical extends Thread {
	
	private String name;
	private String idWork;
	
	public MotorbikeMechanical(String name, String specialization, String idWork) {
		this.name=name;
		this.idWork=idWork;
	}

	
public String getType() {
	return "motorbike mechanical";
}

public String getname() {
	return  this.name;
}

public String presentation() {
		return "Hello, my name is  " + this.name + ", I am a " +
				getType() + ", id: " + 
				this.idWork + ".";
	}	
@Override

	public void run() {
		System.out.println(this.getname() + " starts his work.");
		System.out.println(this.presentation());
		System.out.println(this.getname() + " finished his Work." );
}


}


