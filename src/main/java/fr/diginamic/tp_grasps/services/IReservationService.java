package fr.diginamic.tp_grasps.services;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public interface IReservationService {

    double setMontantReservation(Client client, TypeReservation type, int nbPlaces);

}
