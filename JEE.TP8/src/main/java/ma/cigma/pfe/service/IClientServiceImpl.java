package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

public class IClientServiceImpl implements IClientService {
	
	IClientDao clientDao;
	
	public void setDao(IClientDao clientDao) {
		
		System.out.println("je suis dans le service");
		this.clientDao=clientDao;
	}
	

	
	
	
	
	 public Client save(Client C) {
		
		 
		 return clientDao.save(C);
		
	}
	

}
