package Domaine;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
	/* {author=Laure, version=1.0}*/


	private ArrayList<Voyageur> listeVoyageur;
	private int numeroReservation;
	private EtatsReservation etatReservation;
	public Client  myClient;
	public Assurance  myAssurance;
	public Voyage  myVoyage;
	public double prixTotal;

   public void reserver(Client c) {
	   Scanner sc = new Scanner(System.in);
		boolean authentifie = false;
		int nbrEssais = 0;
		while(authentifie == false && nbrEssais < 5) {
			System.out.println("Introduisez votre Username puis votre Password");
			authentifie = c.authentification(sc.next(), sc.next());
			nbrEssais++;
		}



		if(authentifie == true){
			this.etatReservation = EtatsReservation.EnCours;
			System.out.println("Entrez le nombre de voyageurs");
			//Proposer le catalogue
			AgenceVoyageService agence = new AgenceVoyageService();
			for(Voyage v: agence.getOffres()) {
				v.toString();
			}
			int numVoyage = sc.nextInt();
			for(Voyage v: agence.getOffres()) {
				if(v.getNumeroVoyage() == numVoyage){
					this.myVoyage = v;
				}
			}
			Client cli = new Client(sc.next(), sc.next(), sc.next(), sc.next());

			int nbrVoyageurs = sc.nextInt();
			int i = 0;
			while(i < nbrVoyageurs){
				Voyageur v = new Voyageur(sc.next(), sc.nextInt(), this);
				listeVoyageur.add(v);
			}
			System.out.println("Entrez le type d'assurance: 1- Assurance Annulation 2- Autre");
			int typeAssurance = sc.nextInt();
			if(typeAssurance == 1){
				Contrat contrat = new Contrat();
				this.myAssurance = new AssuranceAnnulation(100, contrat, this);
			}
			//On doit inclure le prix du voyage
			prixTotal = this.myAssurance.prixAssurance * nbrVoyageurs;
			System.out.println("Choisissez le mode de paiement: 1- CB 2- Cheque");
			int mode = sc.nextInt();
			if(mode == 1){
				CB cb = new CB(sc.nextInt(), sc.next());
				if( Date.valueOf(cb.getDateExpiration()).compareTo(new Date(System.currentTimeMillis())) > 0){
					//Vérifier le solde
					//Contacter la banque
					//payer(cb, prixTotal)
					this.etatReservation = EtatsReservation.Acceptee;

				}
				else{
					this.etatReservation = EtatsReservation.Refusee;
				}
			}
		}
		else {
			//new Exception("Authentification obligatoire");
		}
   }
}