package mechanical;

public class Mechanical extends Thread{
	
	private String Name;
	private String spacialization;
	private String idWork;
	
	public Mechanical(String name, String specialization, String idWork) {
		this.Name=name;
		this.spacialization=specialization;
		this.idWork=idWork;
	}


public String presentation() {
		return "Hello, I'm " + this.Name + ", id: " + 
				this.idWork + "and my specialization is " +
				this.spacialization;
	}	

@Override

public void run() {
	System.out.println(this.presentation());
	System.out.println(this.Name + ": Sta lavorando.");
	System.out.println(this.Name + ": Ha finito di lavorare.");
}
}