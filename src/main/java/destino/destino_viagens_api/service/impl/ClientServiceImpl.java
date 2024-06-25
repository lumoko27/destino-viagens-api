package destino.destino_viagens_api.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import destino.destino_viagens_api.model.Client;
import destino.destino_viagens_api.repository.ClientRepository;
import destino.destino_viagens_api.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public Iterable<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client findById(Long id) {
        Optional<Client> client = clientRepository.findById(id);
        return client.get();
    }

    @Override
    public void insertNew(Client client) {
        saveClient(client);
    }

    @Override
    public void update(Long id, Client client) {
        Optional<Client> clientBd = clientRepository.findById(id);
        if(clientBd.isPresent()) {
            saveClient(client);
        }
    }

    @Override
    public void delete(Long id) {
        clientRepository.deleteById(id);
    }

    private void saveClient(Client client) {
        clientRepository.save(client);
    }
}
