package ma.cigma.pfe;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.presentation.ClientController;

public class ApplicationRunner {

	public static void main(String[] args) {


		ApplicationContext ctx= new
				ClassPathXmlApplicationContext("spring.xml");
		
		ClientController ctrl = (ClientController)
						ctx.getBean("IdCtrl");
				
				Client clt = new Client("OMAR");
				ctrl.save(clt);
				

	}

}