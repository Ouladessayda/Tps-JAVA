package ma.cigma.pfe.dao;

import java.util.List;

import ma.cigma.pfe.models.Facture;

public interface IFactureDao {
	
	Facture Save(Facture F);
	Facture update(Facture F);
	void deleteById(long idClient);
	Facture findById(long idClient);
	List<Facture> findAll();

}
