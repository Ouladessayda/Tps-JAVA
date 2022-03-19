package ma.cigma.pfe.models;

import java.util.List;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="client_type")
@DiscriminatorValue("client")
@Table(name = "TClients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy = "client")
	private List<Facture> factures;
	
	
	
	
	
	
	
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="my_join_table_client_promotion",joinColumns = @JoinColumn(
			name = "client_fk",
			referencedColumnName = "id"
			),
			inverseJoinColumns = @JoinColumn(
			name = "promotion_fk",
		referencedColumnName = "id"
			))
	private List<Promotion> promotions;
	
	
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy = "client")
	private CarteFidelio carteFidelio;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy = "client_Adresse")
	private Adresse adresse;
	
	
	public CarteFidelio getCarteFidelio() {
		return carteFidelio;
	}

	public void setCarteFidelio(CarteFidelio carteFidelio) {
		this.carteFidelio = carteFidelio;
	}

	public List<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(List<Promotion> promotions) {
		this.promotions = promotions;
	}

	public Client(String name,Adresse adresse) {
		this.name = name;
		this.adresse = adresse;
	} 
	
	public Client(String name) {
		this.name = name;
	} 
	
	public Client(long id,String name,Adresse adresse) {
		this.name = name;
		this.id = id;
		this.adresse = adresse;
	} 
	
	
	public Client(long id) {
		this.id = id;
	} 
	
	public Client() {
	}
	
	
	
	

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	@Override
	public String toString() {
	return "Client{" +
	"id=" + id +
	", name='" + name + '\'' +
	'}';
	}
	

}

