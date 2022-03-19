package ma.cigma.pfe;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.models.Adresse;
import ma.cigma.pfe.models.CarteFidelio;
import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.models.Produit;
import ma.cigma.pfe.models.Promotion;
import ma.cigma.pfe.presentation.ClientController;

public class ApplicationRunner {

	public static void main(String[] args) {

		

		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("idCtrl");
		
		
		
		Client client = new Client("OMAR",new Adresse("Avenue 1","Ville1","Pays1"));
		List<Facture> factures = Arrays.asList(new Facture(1500,"facture1", Arrays.asList(new Produit("P1",52),new Produit("P2",150))),new Facture(2000,"facture2", Arrays.asList(new Produit("P3",512),new Produit("P4",15550))));
		client.setFactures(factures);
		ctrl.Save(client);
		
		
		Client client2 = new Client("Ahmed",new Adresse("Avenue 2","Ville2","Pays2"));
		CarteFidelio carteFidelio = new CarteFidelio("A29930489");
		carteFidelio.setClient(client);
		client2.setCarteFidelio(carteFidelio);
		ctrl.Save(client2);
		
		

		

	}

}
