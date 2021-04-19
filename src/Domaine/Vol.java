package Domaine;

public class Vol extends Prestation {
  /* {author=Laure, version=1.0}*/


  private String aeroport;
  private String compagnie;
public String getAeroport() {
	return aeroport;
}
public void setAeroport(String aeroport) {
	this.aeroport = aeroport;
}
public String getCompagnie() {
	return compagnie;
}
public void setCompagnie(String compagnie) {
	this.compagnie = compagnie;
}
public Vol(String aeroport, String compagnie) {
	super();
	this.aeroport = aeroport;
	this.compagnie = compagnie;
}

}