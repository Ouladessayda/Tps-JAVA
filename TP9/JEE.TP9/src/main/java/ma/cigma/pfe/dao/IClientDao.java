package ma.cigma.pfe.dao;

import java.util.List;

import ma.cigma.pfe.models.Client;

public interface IClientDao {
	
	Client Save(Client C);
	Client update(Client c);
	void deleteById(long idClient);
	Client findById(long idClient);
	List<Client> findAll();
}
