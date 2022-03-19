package ma.cigma.pfe.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ma.cigma.pfe.models.Client;
import ma.cigma.pfe.service.IClientService;

@Controller("idCtrl")
public class ClientController {
	
	@Autowired
	IClientService clientService;
	
	
	




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
