package ma.cigma.pfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.cigma.pfe.dao.IClientDao;
import ma.cigma.pfe.models.Client;

@Service

public class IClientServiceImpl implements IClientService {
	
	@Autowired
	IClientDao clientDao;
	
	@Override
    @Transactional
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
