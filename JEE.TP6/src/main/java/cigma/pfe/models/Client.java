package cigma.pfe.models;




public class Client {
	

	 private long Id;

	 private String Name;
	 
	 
	 public Client(String Name) {
		 
		 this.Name=Name;
	 }
	 
	 public Client() {
		 
		 
	 }
	
	 @Override
	 public String toString() {
		 return "Client{" +
		 "id=" + this.Id +
		 ", name='" + this.Name + '\'' +
		 '}';
		 }

}
