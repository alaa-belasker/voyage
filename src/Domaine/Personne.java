package Domaine;

public abstract class Personne {
  /* {author=Laure, version=1.0}*/


  private String civilite;
  /* {author=Laure, version=1.0}*/

  private String nom;
  /* {author=Laure, version=1.0}*/

  private String prenom;
  /* {author=Laure, version=1.0}*/

  private String email;
  public Adresse  myAdresse;
public String getCivilite() {
	return civilite;
}
public void setCivilite(String civilite) {
	this.civilite = civilite;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Personne(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
	super();
	this.civilite = civilite;
	this.nom = nom;
	this.prenom = prenom;
	this.email = email;
	this.myAdresse = myAdresse;
}
public Personne() {
	super();
}

}