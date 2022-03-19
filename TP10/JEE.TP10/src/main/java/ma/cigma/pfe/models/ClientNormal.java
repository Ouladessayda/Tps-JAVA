package ma.cigma.pfe.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@Data
@DiscriminatorValue("normal")
@PrimaryKeyJoinColumn(name="normal_id")
public class ClientNormal extends Client{
	
	private int importanceLevel;
	public ClientNormal(String name, int importanceLevel) {
	super(name);
	this.importanceLevel = importanceLevel;
	}
	public int getImportanceLevel() {
		return importanceLevel;
	}
	public void setImportanceLevel(int importanceLevel) {
		this.importanceLevel = importanceLevel;
	}
	
	
	

}
