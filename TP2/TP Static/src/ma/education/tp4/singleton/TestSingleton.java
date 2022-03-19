package ma.education.tp4.singleton;

public class TestSingleton {

	public static void main(String[] args) {

		Terre t1= Terre.getInstance(1000, 2000);
		Terre t2= Terre.getInstance(4000, 5000);	
		
	System.out.println(t1.surface + " " + t1.distanceToSoleil);	
	System.out.println(t2.surface + " " + t2.distanceToSoleil);	

	}

}
