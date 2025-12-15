package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;

public class ClasseService {

    public static void setReservation(Client client, Reservation reservation) {

        client.getReservations().add(reservation);

    }

}
