package fr.diginamic.tp_grasps.daos;

import java.util.Optional;
import java.util.stream.Stream;

import fr.diginamic.tp_grasps.beans.Client;

public class ClientDao implements IClientDao {

	private static final Client[] clients = {new Client("1", true), new Client("2", true), new Client("3", false)};

	@Override
	public Client extraireClient(String id) {
		
		Optional<Client> opt = Stream.of(clients).filter(c->c.getIdentifiantClient().equals(id)).findAny();
        return opt.orElse(null);

    }

}
