package fr.diginamic.tp_grasps;

import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.factories.IReservationFactory;
import fr.diginamic.tp_grasps.factories.ReservationFactory;

/** Controlleur qui prend en charge la gestion des réservations client
 * @author RichardBONNAMY
 *
 */
public class ReservationController {

	private static final IReservationFactory reservationFactory = new ReservationFactory();

	/** Méthode qui créée une réservation pour un client à partir des informations transmises
	 * @param params contient toutes les infos permettant de créer une réservation
	 * @return Reservation
	 */
	public Reservation creerReservation(Params params) {

		String identifiantClient = params.getIdentifiantClient();
		String dateReservationStr = params.getDateReservation();
		String typeReservation = params.getTypeReservation();
		int nbPlaces = params.getNbPlaces();

        return reservationFactory.newReservation(identifiantClient, dateReservationStr, typeReservation, nbPlaces);

	}

}
