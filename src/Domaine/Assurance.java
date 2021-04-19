package Domaine;

/**
 *  L'utilisateur peut souscrire une assurance
 */
public class Assurance {


    public Assurance(double prixAssurance, Contrat myContrat, Reservation myReservation) {
		super();
		this.prixAssurance = prixAssurance;
		this.myContrat = myContrat;
		this.myReservation = myReservation;
	}
	public double prixAssurance;
    public Contrat  myContrat;
    public Reservation  myReservation;

}