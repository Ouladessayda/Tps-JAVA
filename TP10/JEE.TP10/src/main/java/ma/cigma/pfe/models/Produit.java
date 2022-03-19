package ma.cigma.pfe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TProduit")
public class Produit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String Name;
	
	@Column
	private long Price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdFacture")
	private Facture facture;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getPrice() {
		return Price;
	}

	public void setPrice(long price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", Name=" + Name + ", Price=" + Price + "]";
	}

	public Produit( String name, long price) {

		Name = name;
		Price = price;
	}


	public Produit() {
		
	}
	
	

}
