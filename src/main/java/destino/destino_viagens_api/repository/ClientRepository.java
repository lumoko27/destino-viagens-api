package destino.destino_viagens_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import destino.destino_viagens_api.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
