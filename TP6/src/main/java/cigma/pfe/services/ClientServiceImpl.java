package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;

public class ClientServiceImpl implements ClientService{
	
	
	//ClientRepository clientRepository = new ClientRepositoryImpl();
	
	ClientRepository clientRepository ;
	
	
	public ClientServiceImpl(ClientRepository clientRepository){
		
		System.out.println("Je suis dans la classe ClientServiceImpl");
		this.clientRepository = clientRepository;
		
	}
	

	public Client save(Client C) {
		
		System.out.println("Service Layer : ClientServiceImpl Level... ");
		return clientRepository.save(C);
	}

}
