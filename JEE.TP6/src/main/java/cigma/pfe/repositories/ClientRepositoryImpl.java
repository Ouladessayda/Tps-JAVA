package cigma.pfe.repositories;


import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository{
	

			
	public ClientRepositoryImpl(){
		
		System.out.println("Je suis dans la classe ClientRepositoryImpl");

		
	}
	
	public Client save(Client C) {
		
		System.out.println("DAO Layer : ClientRepositoryImpl Level");
		
		return null;
	}

}
