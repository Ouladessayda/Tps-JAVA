package ma.cigma.pfe.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private long id;
	
	@Column
	private Date date;
	
	@Column
	private long amount; 
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Facture( Date date, long amount) {

		this.date = date;
		this.amount = amount;
	}
	
	public Facture( long id,Date date, long amount) {

		this.id = id;
		this.date = date;
		this.amount = amount;
	}

	public Facture() {

	}

	@Override
	public String toString() {
		return "Facture [id=" + id + ", date=" + date + ", amount=" + amount + "]";
	}
	
	

}
