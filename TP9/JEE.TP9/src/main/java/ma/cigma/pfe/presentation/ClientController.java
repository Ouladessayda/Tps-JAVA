package ma.cigma.pfe.presentation;

import java.util.List;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;

public class ClientController {
	
	IClientService clientService;
	
	
	
	

	
	public void setClientService(IClientService clientService) {

		this.clientService = clientService;
	}






	public Client Save(Client C) {
		
	
		return clientService.Save(C);
		
	}
	
	public Client update(Client C) {

		return clientService.update(C);
	}
	
	public void deleteById(long idClient) {

		clientService.deleteById(idClient);
	}
	
	public Client findById(long idClient) {

		return clientService.findById(idClient);
	}

	public List<Client> findAll() {

		return clientService.findAll();
	}

}
