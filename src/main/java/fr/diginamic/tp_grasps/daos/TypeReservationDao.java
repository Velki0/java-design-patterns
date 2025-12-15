package fr.diginamic.tp_grasps.daos;

import java.util.Optional;
import java.util.stream.Stream;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public class TypeReservationDao implements ITypeReservationDao {

	private static final TypeReservation[] types = {new TypeReservation("TH", 150.0, 15.0), new TypeReservation("CI", 10.9, 0.0)};

	@Override
	public TypeReservation extraireTypeReservation(String type) {
		
		Optional<TypeReservation> opt = Stream.of(types).filter(t->t.getType().equals(type)).findAny();
        return opt.orElse(null);

    }
}
