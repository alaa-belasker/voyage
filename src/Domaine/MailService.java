package Domaine;

/**
 *  Service de mail pour notifier que le voyage est accept?.
 */
public class MailService {
  /* {author=Laure, version=1.0}*/
public Reservation reservation;
public Client client ;

public MailService(Reservation reservation) {
	super();
	this.reservation = reservation;
}

}