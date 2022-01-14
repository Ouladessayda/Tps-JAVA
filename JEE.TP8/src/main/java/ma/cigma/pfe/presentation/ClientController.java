package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;

public class ClientController {
	
	
	IClientService clientService;
	
	
	public ClientController(IClientService clientService) {
		
		System.out.println("je suis dans le controller");
		this.clientService =clientService;
	}
	

	
	public Client save(Client C) {
		
		//return null;
		return clientService.save(C);
		
		
	}

}
