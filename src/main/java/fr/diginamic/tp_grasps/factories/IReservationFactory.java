package fr.diginamic.tp_grasps.factories;

import fr.diginamic.tp_grasps.beans.Reservation;

public interface IReservationFactory {

    Reservation newReservation(String dateReservationStr, String typeReservation, String identifiantClient, int nbPlaces);

}
