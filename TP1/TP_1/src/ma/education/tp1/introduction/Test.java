package ma.education.tp1.introduction;

public class Test {

	public static void main(String[] args) {
		
String Nom="Salle Informatique”";
long Id = 2;


Salle O1 = new Salle();
Salle O2 = new Salle(Nom);
Salle O3 = new Salle(Id,Nom);

System.out.println(O1.Id);
System.out.println(O1.Nom);

System.out.println(O2.Id);
System.out.println(O2.Nom);

System.out.println(O3.Id);
System.out.println(O3.Nom);
	}

}
