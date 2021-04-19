package Domaine;

import java.util.ArrayList;

public class Hotel extends Prestation {



  public String nomHotel;
  private int nbEtoiles;
  private ArrayList<Chambre> mesChambres;
  private Adresse adresse;
public int getNbEtoiles() {
	return nbEtoiles;
}
public void setNbEtoiles(int nbEtoiles) {
	this.nbEtoiles = nbEtoiles;
}
public ArrayList<Chambre> getMesChambres() {
	return mesChambres;
}
public void setMesChambres(ArrayList<Chambre> mesChambres) {
	this.mesChambres = mesChambres;
}
public Adresse getAdresse() {
	return adresse;
}
public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}
public Hotel(String nomHotel, int nbEtoiles, ArrayList<Chambre> mesChambres, Adresse adresse) {
	super();
	this.nomHotel = nomHotel;
	this.nbEtoiles = nbEtoiles;
	this.mesChambres = mesChambres;
	this.adresse = adresse;
}

}