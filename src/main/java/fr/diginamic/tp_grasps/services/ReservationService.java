package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationService implements IReservationService {

    public double setMontantReservation(Client client, TypeReservation type, int nbPlaces) {

        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()) {
            return total*(1-type.getReductionPourcent()/100.0);
        }
        else {
            return total;
        }

    }

}
