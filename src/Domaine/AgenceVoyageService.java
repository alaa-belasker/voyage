package Domaine;

import java.util.ArrayList;

public class AgenceVoyageService {
  /* {Laure=Laure, 1.0=1.0}*/
public String nomAgence;
private ArrayList<Voyage> offres;
public ArrayList<Voyage> getOffres() {
	return offres;
}
public void setOffres(ArrayList<Voyage> offres) {
	this.offres = offres;
}
public AgenceVoyageService(String nomAgence) {
	super();
	this.nomAgence = nomAgence;
}
public AgenceVoyageService() {
	// TODO Auto-generated constructor stub
}



}