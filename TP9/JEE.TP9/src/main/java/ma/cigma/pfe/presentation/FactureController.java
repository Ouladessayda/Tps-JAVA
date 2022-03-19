package ma.cigma.pfe.presentation;

import java.util.List;

import ma.cigma.pfe.models.Facture;
import ma.cigma.pfe.service.IFactureService;

public class FactureController {

	IFactureService factureService;
	
	
	
	

	
	
	
	public void setFactureService(IFactureService factureService) {
		this.factureService = factureService;
	}

	public Facture Save(Facture F) {

		return factureService.Save(F);
	}
	
	public Facture update(Facture F) {

		return factureService.update(F);
	}
	
	public void deleteById(long idFacture) {

		factureService.deleteById(idFacture);
	}
	
	public Facture findById(long idFacture) {

		return factureService.findById(idFacture);
	}
	public List<Facture> findAll() {

		return (List<Facture>) factureService.findAll();
	}
}
