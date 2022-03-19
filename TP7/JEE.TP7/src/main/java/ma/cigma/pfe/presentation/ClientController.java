package ma.cigma.pfe.presentation;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;

public class ClientController {
	
	IClientService clientService;
	
	
	
	

	
	public void setClientService(IClientService clientService) {

		this.clientService = clientService;
	}






	public boolean Save(Client C) {
		
	
		return clientService.Save(C);
		
	}

}
