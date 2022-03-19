package ma.cigma.pfe.models;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TFacture")
public class Facture {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdFacture;
	
	@Column
	private String description;
	
	@Column
	private long amount; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "F_client_id", referencedColumnName = "id")
	private Client client;
	
		
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "facture")
	private  List<Produit>  produit;

	public Facture() {

	}




	public List<Produit> getProduit() {
		return produit;
	}




	public void setProduit(List<Produit> produit) {
		this.produit = produit;
	}




	public Facture(long id, String description, long amount) {
		super();
		this.IdFacture = id;
		this.description = description;
		this.amount = amount;
	}

	public Facture(  long amount,String description,Client client) {
		super();
		this.description = description;
		this.amount = amount;
		this.client =client;
	}

	public Facture(  long amount,String description,List<Produit> produit) {
		super();
		this.description = description;
		this.amount = amount;
		this.produit = produit;
	}


	public Client getClient() {
		return client;
	}




	public void setClient(Client client) {
		this.client = client;
	}




	@Override
	public String toString() {
		return "Facture [id=" + IdFacture + ", description=" + description + ", amount=" + amount + "]";
	}






	public long getId() {
		return IdFacture;
	}



	public void setId(long id) {
		this.IdFacture = id;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public long getAmount() {
		return amount;
	}



	public void setAmount(long amount) {
		this.amount = amount;
	}


	
	

}
