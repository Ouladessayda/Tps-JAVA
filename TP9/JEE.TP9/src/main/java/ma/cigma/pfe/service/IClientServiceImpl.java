package ma.cigma.pfe.service;

import java.util.List;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

public class IClientServiceImpl implements IClientService {
	
	IClientDao clientDao;
	
	 public IClientServiceImpl() {
	}

		public void setClientDao(IClientDao clientDao) {
			 
			this.clientDao = clientDao;
		}
	 
	public Client Save(Client C) {

		return clientDao.Save(C);
	}
	
	public Client update(Client C) {

		return clientDao.update(C);
	}
	
	public void deleteById(long idClient) {

		 clientDao.deleteById(idClient);
	}
	
	public Client findById(long idClient) {

		return clientDao.findById(idClient);
	}
	public List<Client> findAll() {

		return (List<Client>) clientDao.findAll();
	}
	
	

}
