package cigma.pfe.View;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;

public class MonApplication {

public static void main(String[] args) {
	
	ClientController clientController;
		
//Instantiation Standard		
//*ClientController ctrl1 = new ClientController();
//*Client client =new Client(1L,"testing");
//*ctrl1.save(client);	

//Instantiation Standard par ApplicationContext
ApplicationContext Actx1 = new ClassPathXmlApplicationContext("spring.xml");
//Definir la classe à instantier a travers Prototype 
clientController= (ClientController) Actx1.getBean("Controller");

Client client = new Client("Omar Ouladessayda");
clientController.save(client);


}

}
