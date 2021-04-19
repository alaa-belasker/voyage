package Domaine;

public class MoyenPaiement {
  /* {author=Laure, version=1.0}*/


  /** 
   *  Nom de la banque
   */
  public String banque;
  /**
   *  Montant sur le compte du client sur le compte de la banque
   */
  public double solde;
public String getBanque() {
	return banque;
}
public void setBanque(String banque) {
	this.banque = banque;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public MoyenPaiement(String banque, double solde) {
	super();
	this.banque = banque;
	this.solde = solde;
}
public MoyenPaiement() {
	super();
}


  
}