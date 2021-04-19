package Domaine;

/**
 *  Domaine.Contrat correspondant entre l'assurance et le client pour telle r?servation
 */
public class Contrat {
  /* {author=Laure, version=1.0}*/


  /** 
   *  reference du contrat
   */
  private Integer reference;
  /* {author=Laure, version=1.0}*/

public Integer getReference() {
	return reference;
}

public void setReference(Integer reference) {
	this.reference = reference;
}

public Contrat(Integer reference) {
	super();
	this.reference = reference;
}

public Contrat() {
	// TODO Auto-generated constructor stub
}

  
}