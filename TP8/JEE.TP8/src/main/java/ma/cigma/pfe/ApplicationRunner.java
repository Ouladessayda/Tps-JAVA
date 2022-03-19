package ma.cigma.pfe;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.presentation.ClientController;
import ma.cigma.pfe.presentation.FactureController;

public class ApplicationRunner {

	public static void main(String[] args) {

		

		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("idCtrl");
		ctrl.Save(new Client("OMAR"));
		ctrl.Save(new Client("Ahmed"));
		ctrl.Save(new Client("rami"));
		ctrl.Save(new Client("ihssane"));
		ctrl.Save(new Client("chahd"));
		ctrl.Save(new Client("safaa"));

		System.out.println(ctrl.findById(5).toString());
		
		ctrl.update(new Client(3,"Achraf"));
		
		System.out.println(ctrl.findById(3).toString());
		
		ctrl.deleteById(1);
		
		List<Client> clt=ctrl.findAll();
		
		for(Client C :clt){
			System.out.println(C.toString());
			}
		
		
		FactureController ctr2 = (FactureController) context.getBean("idCtrl2");
		ctr2.Save(new Facture(new Date(),25485));
		ctr2.Save(new Facture(new Date(),2548));
		ctr2.Save(new Facture(new Date(),44423));
		ctr2.Save(new Facture(new Date(),1115));
		ctr2.Save(new Facture(new Date(),44239));
		ctr2.Save(new Facture(new Date(),4589));
		
        System.out.println(ctr2.findById(5).toString());
		
        ctr2.update(new Facture(3,new Date(),0));
		
		System.out.println(ctr2.findById(3).toString());
		
		ctr2.deleteById(1);
		
		List<Facture> fct=ctr2.findAll();
		
		for(Facture F :fct){
			System.out.println(F.toString());
			}
		

	}

}
