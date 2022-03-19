package ma.cigma.pfe.service;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

public class IClientServiceImpl implements IClientService {
	
	IClientDao clientDao;
	
	 public IClientServiceImpl() {
	}

		public void setClientDao(IClientDao clientDao) {
			 
			this.clientDao = clientDao;
		}
	 
	public boolean Save(Client C) {

		return clientDao.Save(C);
	}

}
