package fr.diginamic.tp_grasps.factories;

import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;
import fr.diginamic.tp_grasps.daos.ClientDao;
import fr.diginamic.tp_grasps.daos.IClientDao;
import fr.diginamic.tp_grasps.daos.ITypeReservationDao;
import fr.diginamic.tp_grasps.daos.TypeReservationDao;
import fr.diginamic.tp_grasps.services.ClasseService;
import fr.diginamic.tp_grasps.services.ReservationService;
import fr.diginamic.tp_grasps.utils.DateUtils;

import java.time.LocalDateTime;

public class ReservationFactory implements IReservationFactory {

    /** DAO permettant d'accéder à la table des clients */
    private static final IClientDao clientDao = new ClientDao();

    /** DAO permettant d'accéder à la table des types de réservation */
    private static final ITypeReservationDao typeReservationDao = new TypeReservationDao();

    @Override
    public Reservation newReservation(String identifiantClient, String dateReservationStr, String typeReservation, int nbPlaces) {

        Reservation reservation = new Reservation();
        Client client = clientDao.extraireClient(identifiantClient);
        LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);
        TypeReservation type = typeReservationDao.extraireTypeReservation(typeReservation);

        reservation.setDate(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);

        ReservationService.setMontantReservation(reservation, client, type, nbPlaces);
        ClasseService.setReservation(client, reservation);

        return reservation;

    }

}
