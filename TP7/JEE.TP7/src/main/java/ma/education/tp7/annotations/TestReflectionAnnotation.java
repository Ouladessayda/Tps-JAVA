package ma.education.tp7.annotations;

public class TestReflectionAnnotation {

	public static void main(String[] args) {
		

		Class Affichage1=Calculatrice.class;

		Programmer P1 = (Programmer) Affichage1.getDeclaredAnnotation(Programmer.class);

		// Affichage des valeurs de l'annotation de la classe mère
		System.out.println(P1.id()+":"+P1.name());



		Class Affichage2=CalculatriceMath.class;

		 Programmer P2 = (Programmer) Affichage2.getAnnotation(Programmer.class);

		//Affichage des valeurs de l'annotation de la classe fille
		System.out.println(P2.id()+":"+P2.name());

			}
	
}
