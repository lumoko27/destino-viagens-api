package destino.destino_viagens_api.service;

import destino.destino_viagens_api.model.Client;

public interface ClientService {

    Iterable<Client> findAll();

    Client findById(Long id);

    void insertNew(Client client);

    void update(Long id, Client client);

    void delete(Long id);
}
