package Domaine;

import java.util.ArrayList;

/** 
 *  La classe Domaine.Voyage est la classe m?tier.
 *  Cette classe est renvoy?e dans une liste par Domaine.AgenceVoyageService.
 */
public class Voyage {

  private int numeroVoyage;
  private Boolean statut;
  public double prix;
  public Formule myFormule;
  public ArrayList<Reservation>  mesReservations;
  private Destination destination;
public int getNumeroVoyage() {
	return numeroVoyage;
}
public void setNumeroVoyage(int numeroVoyage) {
	this.numeroVoyage = numeroVoyage;
}
public Boolean getStatut() {
	return statut;
}
public void setStatut(Boolean statut) {
	this.statut = statut;
}
public Destination getDestination() {
	return destination;
}
public void setDestination(Destination destination) {
	this.destination = destination;
}
public Voyage(int numeroVoyage, Boolean statut, double prix, Formule myFormule, ArrayList<Reservation> mesReservations,
		Destination destination) {
	super();
	this.numeroVoyage = numeroVoyage;
	this.statut = statut;
	this.prix = prix;
	this.myFormule = myFormule;
	this.mesReservations = mesReservations;
	this.destination = destination;
}
@Override
public String toString() {
	return "Voyage [numeroVoyage=" + numeroVoyage + ", prix=" + prix + ", myFormule=" + myFormule
			+ ", mesReservations=" + mesReservations ;
}

}