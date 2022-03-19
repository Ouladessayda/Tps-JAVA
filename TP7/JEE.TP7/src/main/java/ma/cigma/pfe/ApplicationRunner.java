package ma.cigma.pfe;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.presentation.ClientController;

public class ApplicationRunner {

	public static void main(String[] args) {


		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctrl = (ClientController) context.getBean("idCtrl");
				Client clt = new Client("OMAR");
				ctrl.Save(clt);
		
		
				
	}

}
