package Domaine;

import java.util.ArrayList;


/** 
 *  La formule est associ? au voyage.
 */
public class Formule {
 private double prixTotal;
  public ArrayList<Prestation> mesPrestation;
public double getPrixTotal() {
	return prixTotal;
}
public void setPrixTotal(double prixTotal) {
	this.prixTotal = prixTotal;
}
public ArrayList<Prestation> getMesPrestation() {
	return mesPrestation;
}
public void setMesPrestation(ArrayList<Prestation> mesPrestation) {
	this.mesPrestation = mesPrestation;
}
public Formule(double prixTotal, ArrayList<Prestation> mesPrestation) {
	super();
	this.prixTotal = prixTotal;
	this.mesPrestation = mesPrestation;
}

public void addPrestation(Prestation p ) {
	mesPrestation.add(p);
}

}