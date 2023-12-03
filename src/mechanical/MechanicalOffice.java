package mechanical;
import java.util.Random;


public class MechanicalOffice {
	//costanti usati per generare valori casuali
	private final static int MAX_NUM_MC = 20;
	private final static int MAX_NUM_MM = 14;
	private final static String[] NAMES= {"Sergiu", "Adelina", "Paolo", "Jo"};
	private final static String[] SPECIALIZATIONS = {"worker","designer","installer","maintainer"};
	
	
	
	
		public static void main(String[] args) {
			Random r = new Random(System.currentTimeMillis());
			int num_mc = r.nextInt(MAX_NUM_MC);
			int num_mm = r.nextInt(MAX_NUM_MM);
			
			Thread[] threads_to_start = new Thread[num_mc + num_mm];
			
			
			for(int i=0;i<num_mc;i++) {
				int index_name = r.nextInt(NAMES.length);
				int index_specialization = r.nextInt(SPECIALIZATIONS.length);
				
				boolean type = r.nextBoolean();
				String idWork = "MC"+i;
				
				if(type) {
					MechanicalForPorsche a = new MechanicalForPorsche(NAMES[index_name], SPECIALIZATIONS[index_specialization], idWork);
					threads_to_start[i] = new Thread(a);
				}else {
					MechanicalForOtherCar a = new MechanicalForOtherCar(NAMES[index_name], SPECIALIZATIONS[index_specialization], idWork);
					threads_to_start[i] = new Thread (a);
				}
				
			}
				for( int i=0;i<num_mm;i++) {
				int index_name = r.nextInt(NAMES.length);
				int index_specialization = r.nextInt(SPECIALIZATIONS.length);
				String idWork="MM"+i;
				MotorbikeMechanical m = new MotorbikeMechanical(NAMES[index_name],SPECIALIZATIONS[index_specialization],idWork);
					threads_to_start[num_mc+i] = m;
			}
				
				for(Thread t : threads_to_start) {
					t.start();
				}
				
				for(Thread t : threads_to_start) {
					try {
						t.join();
					}catch (InterruptedException e) {
						System.err.println("We are sorry, the workers were interrupted by an unexpected event.");
						e.printStackTrace();
					}
				}
				
				System.out.println("The work was done for today!");
			

//			MechanicalForPorsche p1=new MechanicalForPorsche("Sergiu", "enngineer","1234");
//			MechanicalForOtherCar o1 = new MechanicalForOtherCar("Andrea","engineer" , "1432");
//			MotorbikeMechanical m1= new MotorbikeMechanical("Antonio", "engineer", "1235");
//			Thread t1 = new Thread(p1);
//			Thread t2 = new Thread(o1);
//			
//			t1.start();
//			t2.start();
//			m1.start();
		}
}
