package ma.cigma.pfe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ma.cigma.pfe.models.Client;

@Repository
public class IClientDaoImpl implements IClientDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Client Save(Client c) 
	{
	em.persist(c);
      return null;
     }
	@Override
	public Client update(Client newClient) {
	em.getTransaction().begin();
	Client currentClient =
	em.find(Client.class,newClient.getId());
	currentClient.setName(newClient.getName());
	em.persist(currentClient);
	em.getTransaction().commit();
	return null;
	}
	@Override
	public void deleteById(long idClient) {
	em.getTransaction().begin();
	Client clientInDataBase = em.find(Client.class,idClient);
	em.remove(clientInDataBase);
	em.getTransaction().commit();
	}
	@Override
	public Client findById(long idClient) {
	return em.find(Client.class,idClient);
	}
	@Override
	public List<Client> findAll() {
		Query query = em.createQuery("SELECT t FROM Client t",Client.class);
	return query.getResultList();


	}

}
