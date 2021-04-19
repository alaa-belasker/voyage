package Domaine;

/**
 *  G?n?re facture avec informations ad?quates
 */
public class Facture {
  /* {author=Laure, version=1.0}*/


    public Client  myClient;
    public Reservation myReservation;
	public Facture(Client myClient, Reservation myReservation) {
		super();
		this.myClient = myClient;
		this.myReservation = myReservation;
	}

}