package ma.cigma.pfe.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.cigma.pfe.models.Facture;

public class IFactureDaoImpl implements IFactureDao {

	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("unit_clients");
	EntityManager em=emf.createEntityManager();
	
	@Override
	public Facture Save(Facture F) 
	{
	em.getTransaction().begin();
	em.persist(F);
	em.getTransaction().commit();
      return null;
     }
	@Override
	public Facture update(Facture newF) {
	em.getTransaction().begin();
	Facture currentF =
	em.find(Facture.class,newF.getId());
	currentF.setAmount(newF.getAmount());
	currentF.setDate(newF.getDate());
	em.persist(currentF);
	em.getTransaction().commit();
	return null;
	}
	@Override
	public void deleteById(long idF) {
	em.getTransaction().begin();
	Facture clientInDataBase = em.find(Facture.class,idF);
	em.remove(clientInDataBase);
	em.getTransaction().commit();
	}
	@Override
	public Facture findById(long idF) {
	return em.find(Facture.class,idF);
	}
	@Override
	public List<Facture> findAll() {
		Query query = em.createQuery("SELECT f FROM Facture f",Facture.class);
	return query.getResultList();


	}
	
	
}
