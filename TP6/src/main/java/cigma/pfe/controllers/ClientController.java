package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {

	//ClientService clientService = new ClientServiceImpl();
	
	ClientService clientService;
	
	
	public ClientController(ClientService clientService){
		
		System.out.println("Je suis dans la classe ClientController");
		this.clientService = clientService;

	}
	
	public Client save(Client c ){
	System.out.println("ClientController level...");
	return clientService.save(c);
	}
	
}
