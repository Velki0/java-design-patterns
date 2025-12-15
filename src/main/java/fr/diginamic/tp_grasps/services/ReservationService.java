package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationService {

    public static void setMontantReservation(Reservation reservation, Client client, TypeReservation type, int nbPlaces) {

        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            reservation.setTotal(total*(1-type.getReductionPourcent()/100.0));
        }
        else {
            reservation.setTotal(total);
        }

    }

}
