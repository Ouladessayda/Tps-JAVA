package ma.cigma.pfe.service;

import java.util.List;

import ma.cigma.pfe.models.Facture;

public interface IFactureService {
	
	Facture Save(Facture F);
	Facture update(Facture F);
	void deleteById(long idClient);
	Facture findById(long idClient);
	List<Facture> findAll();

}
