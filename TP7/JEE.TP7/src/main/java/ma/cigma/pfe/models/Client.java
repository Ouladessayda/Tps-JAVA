package ma.cigma.pfe.models;

import javax.persistence.*;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TClients")
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column
	private String name;
	
	
	
	
	public Client(String name) {
		this.name = name;
	} 
	
	public Client(long id,String name) {
		this.name = name;
		this.id = id;
	} 
	
	
	public Client(long id) {
		this.id = id;
	} 
	
	public Client() {
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

	@Override
	public String toString() {
	return "Client{" +
	"id=" + id +
	", name='" + name + '\'' +
	'}';
	}
	

}
