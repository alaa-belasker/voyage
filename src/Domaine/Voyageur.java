package Domaine;

/**
 *  Plusieurs voyageurs peuvent ?tre inscrits sur le m?me voyage (exemple famille).
 */
public class Voyageur extends Personne {
  /* {author=Laure, version=1.0}*/


  public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse) {
		super(civilite, nom, prenom, email, myAdresse);
		// TODO Auto-generated constructor stub
	}
/** 
   *  num?ro de passeport ou de carte d'identit? (compos? de chiffres et de lettre donc on met par d?faut un type String)
   */
  private String numeroPieceIdentite;
  private int age;
  public Reservation  myReservation;
public String getNumeroPieceIdentite() {
	return numeroPieceIdentite;
}
public void setNumeroPieceIdentite(String numeroPieceIdentite) {
	this.numeroPieceIdentite = numeroPieceIdentite;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}


public Voyageur(String civilite, String nom, String prenom, String email, Adresse myAdresse, String numeroPieceIdentite,
		int age, Reservation myReservation) {
	super(civilite, nom, prenom, email, myAdresse);
	this.numeroPieceIdentite = numeroPieceIdentite;
	this.age = age;
	this.myReservation = myReservation;
}
public Voyageur(String numeroPieceIdentite, int age, Reservation reservation) {
	// TODO Auto-generated constructor stub
}

}