package Domaine;

import java.util.Date;

public class Voiture extends Prestation {
  public Voiture(Date dateDepart, Date dateArrivee, double prixHT) {
		super(dateDepart, dateArrivee, prixHT);
		// TODO Auto-generated constructor stub
	}

/* {author=Laure, version=1.0}*/


  /** 
   *  cat?gorie de la voiture
   */
  private int classe;
  /* {author=Laure, version=1.0}*/

public int getClasse() {
	return classe;
}

public void setClasse(int classe) {
	this.classe = classe;
}

}