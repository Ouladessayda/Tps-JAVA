package ma.cigma.pfe.service;

import java.util.List;

import ma.cigma.pfe.dao.IFactureDao;
import ma.cigma.pfe.models.Facture;

public class IFactureServiceImpl implements IFactureService{
	
	
	IFactureDao factureDao;
	
	 public IFactureServiceImpl() {
	}


	 
	public void setFactureDao(IFactureDao factureDao) {
		this.factureDao = factureDao;
	}



	public Facture Save(Facture F) {

		return factureDao.Save(F);
	}
	
	public Facture update(Facture F) {

		return factureDao.update(F);
	}
	
	public void deleteById(long idFacture) {

		factureDao.deleteById(idFacture);
	}
	
	public Facture findById(long idFacture) {

		return factureDao.findById(idFacture);
	}
	public List<Facture> findAll() {

		return (List<Facture>) factureDao.findAll();
	}
	

}
