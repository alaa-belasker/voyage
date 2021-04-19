package Domaine;

/**
 *  Le client n'est pas forc?ment voyageur, c'est celui ou celle qui finance le voyage.
 */
public class Client extends Personne {
  /* {author=Laure, version=1.0}*/


    public Reservation  myReservation;
    public Facture  myFacture;
    /**
   * 
   * @element-type Domaine.MoyenPaiement
   */
  public MoyenPaiement  myMoyenPaiement;
	public Client(Reservation myReservation, Facture myFacture, MoyenPaiement myMoyenPaiement) {
		super();
		this.myReservation = myReservation;
		this.myFacture = myFacture;
		this.myMoyenPaiement = myMoyenPaiement;
	}
public static String user = "Client1";
public static String password = "123456";




public Client(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
	super(civilite, nom, prenom, email, myAdresse);
}




public Client() {
	// TODO Auto-generated constructor stub
}




public Client(String nom, String prenom, String email, String civilite) {
	// TODO Auto-generated constructor stub
}




public boolean authentification(String userName, String passWord){
	System.out.println(userName.equals(this.user));
	return userName.equals(this.user)  && passWord.equals(this.password) ;
}
}