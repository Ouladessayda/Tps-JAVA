package ma.cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import ma.cigma.pfe.models.Client;

public class IClientDaoImpl implements IClientDao {
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	@Override
	public boolean Save(Client c) 
	{
		System.out.println("dao");
	em.getTransaction().begin();
	em.persist(c);
	em.getTransaction().commit();
	return true;
	}
	

}
