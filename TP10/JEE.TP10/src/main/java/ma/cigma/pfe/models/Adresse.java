package ma.cigma.pfe.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TAdresse")
public class Adresse {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String Avenue;
	
	@Column
	private String Ville;
	
	@Column
	private String Pays;
	
	@OneToOne
	@JoinColumn(name = "Adresse_id")
	private Client client_Adresse;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAvenue() {
		return Avenue;
	}

	public void setAvenue(String avenue) {
		Avenue = avenue;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getPays() {
		return Pays;
	}

	public void setPays(String pays) {
		Pays = pays;
	}

	public Adresse( String avenue, String ville, String pays) {

		Avenue = avenue;
		Ville = ville;
		Pays = pays;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", Avenue=" + Avenue + ", Ville=" + Ville + ", Pays=" + Pays + "]";
	}
	
	
	

}
