package ma.cigma.pfe.dao;

import ma.cigma.pfe.models.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class IClientDaoImpl implements IClientDao{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	public IClientDaoImpl() {
		
		System.out.println("je suis dans le DAO");
	} 
	
	@Override
	public Client save(Client c) {
	//em.getTransaction().begin();
	//em.persist(c);
	//em.getTransaction().commit();
	return null;
	}

}