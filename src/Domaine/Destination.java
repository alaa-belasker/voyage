package Domaine;

public class Destination {
    public String pays;
    public String continent;
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public Destination(String pays, String continent) {
		super();
		this.pays = pays;
		this.continent = continent;
	}
    
}
