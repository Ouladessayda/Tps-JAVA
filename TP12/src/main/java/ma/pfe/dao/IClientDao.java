package ma.pfe.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.pfe.models.Client;

@Repository
public interface IClientDao extends CrudRepository<Client,Long> {
	

	List <Client> findByName(String name);
	
	

}
